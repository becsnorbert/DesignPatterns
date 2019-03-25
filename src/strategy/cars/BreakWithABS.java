package strategy.cars;

public class BreakWithABS implements IBrakeBehavior {
    @Override
    public void brake() {
        System.out.println("Brake with ABS applied");
    }
}
