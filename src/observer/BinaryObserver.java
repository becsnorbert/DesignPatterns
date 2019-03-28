package observer;

public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println("Binray String: " + Integer.toBinaryString(subject.getState()));
    }
}
