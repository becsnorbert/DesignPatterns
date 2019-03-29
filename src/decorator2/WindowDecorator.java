package decorator2;

// absztrakt díszítő osztály, amely megvalósítja a Window interface-t
abstract class WindowDecorator implements Window {

    protected Window decoratedWindow;  // the Window being decorated

    public WindowDecorator(Window decoratedWindow) {
        this.decoratedWindow = decoratedWindow;
    }

    @Override
    public void draw() {
        decoratedWindow.draw();  // delegation
    }

    @Override
    public String getDescription() {
        return decoratedWindow.getDescription();  // delegation
    }
}
