package enums;

public class Robot {
    private final String _name;

    public enum Command{
        WALK,
        STOP,
        JUMP
    }

    public Robot(String name) {
        this._name = name;
    }

    public void order(Command command){
        if(command.equals(Command.WALK)){
            System.out.println(_name + " walks");
        } else if(command.equals(Command.STOP)){
            System.out.println(_name + " stops");
        } else if(command.equals(Command.JUMP)){
            System.out.println(_name + " jumps");
        } else{
            System.out.println("Command error . command" + command);
        }
    }

}


