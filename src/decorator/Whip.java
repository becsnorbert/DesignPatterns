package decorator;

public class Whip extends CondimentDecorator {

    Beverage beverage;  // Egy példányváltozó ami azt a beverage-t tárolja
    // amit be akarunk wrappelni.

    public Whip(Beverage beverage) {  // Itt be is állítjuk.
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {       // Itt hozzadjuk a leíráshoz
        return beverage.getDescription() + ", Whip";   // a fűszert.
    }

    @Override
    public double cost() {
        return .30 + beverage.cost();   // Itt növeljük az árat.
    }

}
