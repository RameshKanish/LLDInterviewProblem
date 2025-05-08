package TicTacToe.State;

public class OturnState implements GameState{

    @Override
    public void next(GameContext gameContext) {
        gameContext.setState(new XturnState());
    }

    @Override
    public boolean isGameOver() {
        return false;
    }
}