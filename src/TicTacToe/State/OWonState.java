package TicTacToe.State;

public class OWonState implements GameState{


    @Override
    public void next(GameContext gameContext) {
        // Game Over
    }

    @Override
    public boolean isGameOver() {
        return true;
    }
}