package state;

public class Main {
    public static void main(String[] args) {
        GumBallMachine gumBallMachine = new GumBallMachine(5);

        System.out.println(gumBallMachine);

        gumBallMachine.insertQuarter();
        gumBallMachine.turnCrank();

        System.out.println(gumBallMachine);

        gumBallMachine.insertQuarter();
        gumBallMachine.turnCrank();
        gumBallMachine.insertQuarter();
        gumBallMachine.turnCrank();

        System.out.println(gumBallMachine);
    }
}
