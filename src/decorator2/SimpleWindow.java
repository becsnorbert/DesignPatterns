package decorator2;

public class SimpleWindow implements Window {

    @Override
    public void draw() {
        // ablak rajzolás
    }

    @Override
    public String getDescription() {
        return "simple window";
    }
}
