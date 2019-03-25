package strategy.cars;

public class SUV extends Car {
    public SUV() {
        this.brakeBehavior = new BreakWithABS();
    }
}
