package state;

public class NoQuarterState implements State {
    GumBallMachine gunBallMachine;

    public NoQuarterState(GumBallMachine gunBallMachine) {
        this.gunBallMachine = gunBallMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gunBallMachine.setState(gunBallMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a qurter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }
}
