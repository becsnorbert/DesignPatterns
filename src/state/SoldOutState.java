package state;

public class SoldOutState implements State {
    GumBallMachine gunBallMachine;

    public SoldOutState(GumBallMachine gumBallMachine) {
        this.gunBallMachine = gunBallMachine;
    }


    @Override
    public void insertQuarter() {
        System.out.println("You can't insert a quarter, the machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can't eject, you haven't inserted a quarter yet");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned but there's no gumballs");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
