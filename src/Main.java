import Command.CommandManager;
import Debugging.Logger;

public class Main {
    public static void main(String[] args){
        CommandManager commandManager = new CommandManager();

        new Logger(); // <-- Instantiate logger file
        commandManager.outputAvailableItems();
        commandManager.outputCommandLine();
    }
}
