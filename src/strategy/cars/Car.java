package strategy.cars;

public class Car {

    protected IBrakeBehavior brakeBehavior;

    public void applyBrake() {
        brakeBehavior.brake();
    }

    public void setBrakeBehavior(IBrakeBehavior brakeBehavior) {
        this.brakeBehavior = brakeBehavior;
    }
}
