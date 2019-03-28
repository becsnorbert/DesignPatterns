package observer;

public abstract class Observer {
    protected Subject subject;
    abstract public void update();
}
