package strategy.billing;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private List<Double> drinks;
    private BillingStrategy strategy;

    public Customer() {
        this.drinks = new ArrayList<>();
    }

    // Új elem az étlapra
    public void add(double price, int quantity) {
        drinks.add(price * quantity);
    }

    // Számla kifizetése
    public void printBill() {
        System.out.println("Total due: " + strategy.sum(drinks));
        drinks.clear();
    }

    // Stratégia beállítása
    public void setStrategy(BillingStrategy strategy) {
        this.strategy = strategy;
    }


}
