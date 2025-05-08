package TicTacToe.State;

public class InProgressState implements GameState{
    @Override
    public void next(GameContext gameContext) {
        gameContext.setState(new InProgressState());
    }

    @Override
    public boolean isGameOver() {
        return false;
    }
}