package Command.Items;

import Command.CommandManager;
import Command.CommandObject;

public class DummyCommand extends CommandObject {
    public DummyCommand() {
        super("Dummy", "This is a dummy command.", "dummy");
    }

    public void execute(){
        System.out.println("You executed a dummy command!");

        CommandManager commandManager = new CommandManager();
        commandManager.findCommandLine("exit");
    }
}
