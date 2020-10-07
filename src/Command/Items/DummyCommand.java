package Command.Items;

import Command.CommandManager;
import Command.CommandObject;

public class DummyCommand extends CommandObject {
    public DummyCommand() {
        super("Dummy", "This is a dummy command.", "dummy");
    }

    public void execute(){ // <-- Make sure you add this to every command class
        System.out.println("You executed a dummy command!");

        CommandManager commandManager = new CommandManager(); // <-- New command manager instance
        commandManager.findCommandLine("exit"); // <-- Go back
    }
}
