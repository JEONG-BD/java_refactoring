package enums;


import enums.Robot.Command;

public class Main {
    public static void main(String[] args) {
        Robot robot  = new Robot("Andrew");
        robot.order(Command.WALK);
        robot.order(Command.STOP);
        robot.order(Command.JUMP);
    }
}
