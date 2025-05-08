package TicTacToe.models;

import TicTacToe.State.GameContext;
import TicTacToe.State.GameState;
import TicTacToe.statergy.PlayerStatergy;

public class TicTacToeGame implements BoardGame{
    private Board board;
    private Player playerX;
    private Player playerY;
    private Player currentPlayer;
    private GameContext gameContext;

    public TicTacToeGame(PlayerStatergy xplayerStatergy , PlayerStatergy oplayerstatergy , int row , int col){
        this.playerX = new Player(Symbol.X , xplayerStatergy);
        this.playerY = new Player(Symbol.O , oplayerstatergy);
        this.board = new Board(row , col);
        this.currentPlayer = playerX;
        gameContext = new GameContext();
    }

    @Override
    public void play() {
        do{
            System.out.println("Board");
            board.printBoard();
            Position pos = currentPlayer.getPlayerStatergy().makeMove(board);
            board.makeMove(pos , currentPlayer.getPlayerSymbol());
            board.checkGameState(gameContext);
            switchPlayer();
        }while (!gameContext.isGameOver());
    }
    private void switchPlayer(){
        System.out.println("CurrentPlayer" + currentPlayer);
        currentPlayer = (currentPlayer == playerX) ? playerY : playerX;
        System.out.println("Next Player" + currentPlayer);
    }
}