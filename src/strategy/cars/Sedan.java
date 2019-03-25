package strategy.cars;

public class Sedan extends Car {
    public Sedan() {
        this.brakeBehavior = new Brake();
    }
}
