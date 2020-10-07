package Command.Items;

import Command.CommandManager;
import Command.CommandObject;
import Debugging.Logger;

public class DummyCommand extends CommandObject {
    public DummyCommand() {
        super("Dummy", "This is a dummy command.", "dummy");
    }

    public void execute(){ // <-- Make sure you add this to every command class
        System.out.println("You executed a dummy command!");
        Logger.log("Executed the dummy command!", Logger.disableLogger, 1);

        CommandManager commandManager = new CommandManager(); // <-- New command manager instance
        commandManager.findCommandLine("exit"); // <-- Go back
    }
}
