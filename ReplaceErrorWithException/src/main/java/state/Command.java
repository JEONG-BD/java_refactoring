package state;


import java.util.HashMap;
import java.util.Map;


public abstract class Command {
    public static final Command FORWARD = new  Forward();
    public static final Command BACKWARD = new Backward();
    public static final Command TURN_RIGHT = new Right();
    public static final Command TURN_LEFT = new Left();
    private static final Map<String,Command> _commandNameMap = new HashMap<>();
    private final String _name;
    static {
        _commandNameMap.put(FORWARD._name, FORWARD);
        _commandNameMap.put(BACKWARD._name, BACKWARD);
        _commandNameMap.put(TURN_LEFT._name, TURN_LEFT);
        _commandNameMap.put(TURN_RIGHT._name, TURN_RIGHT);
    }

    protected Command(String name) {
         _name = name;
    }

    public String getName(){
        return _name;
    }

    public static Command parseCommand(String name) throws InvalidCommandException {
        if(!_commandNameMap.containsKey(name)){
            throw  new InvalidCommandException();
        }
        return _commandNameMap.get(name);
    }

    public abstract void execute(state.Robot robot);

    private static class Forward extends Command {
        public Forward(){
            super("forward");
        }

        @Override
        public void execute(Robot robot) {
            robot.forward();
        }
    }

    private static class Backward extends Command {
        public Backward() {
            super("backward");
        }

        @Override
        public void execute(Robot robot) {
            robot.backward();
        }
    }

    private static class Right extends Command {
        public Right() {
            super("right");
        }

        @Override
        public void execute(Robot robot) {
            robot.right();
        }
    }

    private static class Left extends Command {
        public Left() {
            super("left");
        }

        @Override
        public void execute(Robot robot) {
            robot.left();
        }
    }
}
