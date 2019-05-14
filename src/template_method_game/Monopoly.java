package template_method_game;

public class Monopoly extends Game {
    @Override
    void initializeGame() {
        System.out.println("initialize MONOPOLY");
    }

    @Override
    void makePlay(int player) {
        System.out.println("makePlay MONOPOLY");
    }

    @Override
    boolean endOfGame() {
        return false;
    }

    @Override
    void printWinner() {
        System.out.println("printWinner MONOPOLY");
    }

    /* Specific declarations for the Monopoly game. */

    // ...
}
