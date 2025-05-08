package TicTacToe.State;

public class XwonState implements GameState{

    @Override
    public void next(GameContext gameContext) {
        // Game Over
    }

    @Override
    public boolean isGameOver() {
        return true;
    }
}