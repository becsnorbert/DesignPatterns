package decorator;

public class Soy extends CondimentDecorator {

    Beverage beverage;  // Egy példányváltozó ami azt a beverage-t tárolja
    // amit be akarunk wrappelni.

    public Soy(Beverage beverage) {  // Itt be is állítjuk.
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {       // Itt hozzadjuk a leíráshoz
        return beverage.getDescription() + ", Soy";   // a fűszert.
    }

    @Override
    public double cost() {
        return .30 + beverage.cost();   // Itt növeljük az árat.
    }

}
