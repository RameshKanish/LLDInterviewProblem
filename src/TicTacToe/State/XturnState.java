package TicTacToe.State;

public class XturnState implements GameState{

    @Override
    public void next(GameContext gameContext) {
        gameContext.setState(new OturnState());
    }

    @Override
    public boolean isGameOver() {
        return false;
    }
}