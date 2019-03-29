package decorator;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Espresso"; // A descriptiont a constructorban állítjuk be.
    }

    @Override
    public double cost() {
        return 2;
    }
}
