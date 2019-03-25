package strategy.cars;

public class Brake implements IBrakeBehavior {
    @Override
    public void brake() {
        System.out.println("Simple Brake applied");
    }
}
