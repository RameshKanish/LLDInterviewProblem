package TicTacToe.State;

public class DrawState implements GameState{
    @Override
    public void next(GameContext gameContext) {

    }

    @Override
    public boolean isGameOver() {
        return true;
    }
}
