package singleton;

public class TestLogger {

    public static void main(String[] args) {

        System.out.println("--------------singleton-------------------");
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        System.out.println(logger1.hashCode());
        System.out.println(logger2.hashCode());

        System.out.println("--------------non singleton--------------");
        TestLogger obj3 = new TestLogger();
        TestLogger obj4 = new TestLogger();

        System.out.println(obj3.hashCode());
        System.out.println(obj4.hashCode());
    }

}
