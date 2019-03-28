package observer;

public class Main {

    public static void main(String[] args) {

        Subject subject = new Subject();

        Observer hexaObserver = new HexaObserver(subject);
        Observer octalObserver = new OctalObserver(subject);
        Observer binaryObserver = new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.attach(hexaObserver);
        subject.attach(octalObserver);
        subject.attach(binaryObserver);
        subject.setState(42);
        System.out.println("Second state change: 10");
        subject.deteach(hexaObserver);
        subject.setState(10);
    }
}
