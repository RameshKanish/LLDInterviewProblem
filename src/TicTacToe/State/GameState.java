package TicTacToe.State;

public interface GameState {
    void next(GameContext gameContext);
    boolean isGameOver();
}