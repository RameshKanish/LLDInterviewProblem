package TicTacToe.State;

public class GameContext {
    private GameState currentState;

    public GameContext(){
        this.currentState = new XturnState();
    }
    public void setState(GameState gameState){
        this.currentState = gameState;
    }

    public void next(){
        currentState.next(this);
    }
    public boolean isGameOver(){
        return currentState.isGameOver();
    }
    public GameState getCurrentState(){
        return currentState;
    }
}
