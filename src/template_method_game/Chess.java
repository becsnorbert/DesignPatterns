package template_method_game;

public class Chess extends Game {
    @Override
    void initializeGame() {
        // Initialize players
        // Put the pieces on the board
    }

    @Override
    void makePlay(int player) {
        // Process a turn for the player
    }

    @Override
    boolean endOfGame() {
        return false;
    }

    @Override
    void printWinner() {
        // Return true if in Checkmate or
        // Stalemate has been reached
    }

    /* Specific declarations for the chess game. */
    // ...
}
