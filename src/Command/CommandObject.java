package Command;

public class CommandObject {
    private final String name;
    private final String description;
    private final String command;

    public CommandObject(final String name, final String description, final String command){
        this.name = name;
        this.description = description;
        this.command = command;
    }

    public String getName(){
        return this.name;
    }
    public String getDescription(){
        return this.description;
    }
    public String getCommand(){
        return this.command.toLowerCase();
    }

    public void execute(){
        this.execute();
    }

}
