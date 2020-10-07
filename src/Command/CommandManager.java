package Command;

import Command.Items.DowngradeCommand;
import Command.Items.DummyCommand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CommandManager {

    // Shouldn't be using 2 lists but it works
    private ArrayList<CommandObject> menuObjects = new ArrayList<>();
    private HashMap<String,String> menuItems = new HashMap<>();

    private ArrayList<CommandObject> registerCommands(){

        if(!menuObjects.contains(new DummyCommand())) {
            menuObjects.add(new DummyCommand()); // <-- Registering the command
        }
        if(!menuObjects.contains(new DowngradeCommand())) {
            menuObjects.add(new DowngradeCommand()); // <-- Registering the command
        }

        for (CommandObject object : menuObjects) {
            if(!menuItems.containsKey(object.getName())) {
                menuItems.put(object.getName(), object.getDescription());
            }
        }

        /*if(addTo.equalsIgnoreCase("menuItems")) {
            for (CommandObject object : menuObjects) {
                menuItems.put(object.getName(), object.getDescription());
            }
        }else if(addTo.equalsIgnoreCase("commandLine")){
            outputCommandLine(menuObjects);
        }*/
        return menuObjects;
    }

    public void outputAvailableItems(){

        registerCommands(); // Add if not already added

        for(Map.Entry<String,String> entry : menuItems.entrySet()){
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }

        //menuItems.clear(); // <-- Avoids duplicates
    }

    public void outputCommandLine(){


        System.out.println(" ");
        System.out.println(" --- Type under here ---");
        Scanner obj = new Scanner(System.in);
        String output = obj.nextLine();
        System.out.println(" ");

        registerCommands();
        for(CommandObject commandObject : menuObjects){
            if(output.equalsIgnoreCase(commandObject.getCommand())){
                commandObject.execute();
            }
        }

        if(output.equalsIgnoreCase("exit") || output.equalsIgnoreCase("quit")) { System.exit(1); }
        else{
            System.out.println("Unknown Command! Please try again");
            findCommandLine("exit");
        }
    }

    public void findCommandLine(String location){
        if(location.equalsIgnoreCase("exit")) {
            System.out.println(" ");
            System.out.println(" --- --------------- ---");
            System.out.println(" ");
            outputAvailableItems();
            outputCommandLine();
        }
    }

}
