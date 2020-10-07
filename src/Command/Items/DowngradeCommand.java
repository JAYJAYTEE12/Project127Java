package Command.Items;

import Command.CommandManager;
import Command.CommandObject;
import Debugging.Logger;

import java.io.IOException;

public class DowngradeCommand extends CommandObject {
    public DowngradeCommand(){
        super("Downgrade", "Downgrades your GTA V to patch 1.27", "downgrade");
    }
    public void execute(){
        System.out.println("The downgrade process has begun!");
        Logger.log("Starting the downgrade process...", Logger.disableLogger, 2);

        // Kill GTA V Process
        System.out.println("Killing GTA V process before continuing...");
        try {
            Runtime.getRuntime().exec("taskkill /F /IM gta5.exe");
            System.out.println("Attempting to kill the GTA V process.");
        } catch (IOException e) {
            System.out.println("There was an unknown error whilst trying to kill the GTA V process.");
        }



        CommandManager commandManager = new CommandManager(); // <-- New command manager instance
        commandManager.findCommandLine("exit"); // <-- Go back
    }
}
