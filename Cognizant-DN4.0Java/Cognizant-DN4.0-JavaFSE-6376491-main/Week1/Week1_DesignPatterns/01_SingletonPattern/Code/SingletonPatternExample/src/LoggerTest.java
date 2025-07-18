public class LoggerTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        if (logger1 == logger2) {
            System.out.println("Logger is a singleton. Both references point to the same instance.");
        } else {
            System.out.println("Logger is not a singleton. Different instances were created.");
        }
    }
}