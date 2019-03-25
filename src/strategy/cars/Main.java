package strategy.cars;

public class Main {

    public static void main(String[] args ) {
        Car sedanCar = new Sedan();
        sedanCar.applyBrake();   // "Brake" meghívás

        Car suvCar = new SUV();
        suvCar.applyBrake();    // "BrakeWithABS" meghívása

        // Fék viselkedésének dinamikus beállítása
        suvCar.setBrakeBehavior(new Brake());
        suvCar.applyBrake();

    }
}
