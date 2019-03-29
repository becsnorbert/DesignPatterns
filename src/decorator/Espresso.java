package decorator;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso"; // A descriptiont a constructorban állítjuk be.
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
