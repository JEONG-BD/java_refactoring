package before;

import java.util.StringTokenizer;

public class Robot {
    private String _name;
    private Position _position = new Position(0, 0);
    private Direction _direction = new Direction(0, 1);

    public Robot(String name) {
        this._name = name;
    }

    public void execute(String commandSequence){
        StringTokenizer tokenizer = new StringTokenizer(commandSequence);
        while (tokenizer.hasMoreTokens()){
            String token = tokenizer.nextToken();
            if(!executeCommand(token)){
                System.out.println("Invalid command " + token);
                break;
            }
        }
    }

    private boolean executeCommand(String commandString) {
        Command command  = Command.parseCommand(commandString);
        if(command == null){
            return false;
        }
        return executeCommand(command);
    }

    public boolean executeCommand(Command command){
        if(command == Command.FORWARD){
            _position.relativeMove(_direction._x, _direction._y);
        } else if(command == Command.BACKWARD){
            _position.relativeMove(_direction._x, _direction._y);
        } else if(command == Command.TURN_LEFT){
            _direction.setDirection(_direction._y, _direction._x);
        } else if(command == Command.TURN_RIGHT){
            _direction.setDirection(_direction._y, _direction._x);
        } else {
            return false;
        }

        return true;
    }

    public String toString() {
        return "[ Robot: " + _name + " "
                + "position(" + _position._x + ", " + _position._y + "), "
                + "direction(" + _direction._x + ", " + _direction._y + ") ]";
    }
}
