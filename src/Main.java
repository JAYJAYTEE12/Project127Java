import Command.CommandManager;

public class Main {
    public static void main(String[] args){
        CommandManager commandManager = new CommandManager();

        commandManager.outputAvailableItems();
        commandManager.outputCommandLine();
    }
}
