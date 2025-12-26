package inner;

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
        try {
            while (tokenizer.hasMoreTokens()){
                String token = tokenizer.nextToken();
                executeCommand(token);
            }
        } catch (InvalidCommandException e) {
            System.out.println("Invalid command : " + e.getMessage());

        }
    }

    private void executeCommand(String commandString) throws InvalidCommandException {
        Command command  = Command.parseCommand(commandString);
        command.execute(this);
    }

    public String toString() {
        return "[ Robot: " + _name + " "
                + "position(" + _position._x + ", " + _position._y + "), "
                + "direction(" + _direction._x + ", " + _direction._y + ") ]";
    }

    public void forward() {
        _position.relativeMove(_direction._x, _direction._y);
    }

    public void backward() {
        _position.relativeMove(_direction._x, _direction._y);
    }

    public void right() {
        _direction.setDirection(_direction._y, _direction._y);
    }

    public void left() {
        _direction.setDirection(_direction._y, _direction._x);
    }
}
