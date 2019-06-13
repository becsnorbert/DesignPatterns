package state;

public class WinnerState implements State {
    GumBallMachine gumBallMachine;

    public WinnerState(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you anoter gumball!");
    }

    @Override
    public void dispense() {
        System.out.println("YOU1RE A WINNER! You get two gumballs for your quarter");
        gumBallMachine.releaseBall();
        if (gumBallMachine.getCount() == 0) {
            gumBallMachine.setState(gumBallMachine.getSoldOutState());
        } else {
            gumBallMachine.releaseBall();
            if (gumBallMachine.getCount() > 0) {
                gumBallMachine.setState(gumBallMachine.getNoQuarterState());
            } else {
                System.out.println("Oops, out of gumballs!");
                gumBallMachine.setState(gumBallMachine.getSoldOutState());
            }
        }
    }
}
