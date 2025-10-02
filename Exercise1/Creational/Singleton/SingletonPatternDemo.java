package Exercise1.Creational.Singleton;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Application started");
        logger2.log("Application still using the same logger instance");

        System.out.println("logger1 == logger2 ? " + (logger1 == logger2));
    }
}
