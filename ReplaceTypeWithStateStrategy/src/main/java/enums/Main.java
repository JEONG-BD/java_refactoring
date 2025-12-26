package enums;

public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.log("Information #1");

        logger.start();
        logger.log("Information #2");


        logger.start();
        logger.log("Information #3");


        logger.stop();
        logger.log("Information #3");

        logger.stop();
        logger.log("Information #4");

        logger.stop();
        logger.log("Information #3");
    }
}
