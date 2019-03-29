package decorator;

public class Mocha extends CondimentDecorator {

    Beverage beverage;  // Egy példányváltozó ami azt a beverage-t tárolja
                        // amit be akarunk wrappelni.

    public Mocha(Beverage beverage) {  // Itt be is állítjuk.
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {       // Itt hozzadjuk a leíráshoz
        return beverage.getDescription() + ", Mocha";   // a fűszert.
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();   // Itt növeljük az árat.
    }
}
