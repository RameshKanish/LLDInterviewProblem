//package TicTacToe.models;
//
//import TicTacToe.Factory.PlayerFactory;
//import TicTacToe.statergy.PlayerStatergy;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class TicTacToe {
//    private Board board;
//    private List<Player> players;
//    public int currentPlayerIdx;
//
//    public TicTacToe(List<PlayerStatergy> playerStatergies , PlayerFactory playerFactory){
//        board = new Board();
//        players = new ArrayList<>();
//
//        for(int i = 0 ; i < playerStatergies.size() ; i++){
//            Symbol symbol = Symbol.values()[i];
//            players.add(playerFactory.createPlayer(symbol , playerStatergies.get(i)));
//        }
//        currentPlayerIdx = 0;
//    }
//    private Player currentPlayer(){
//        return players.get(currentPlayerIdx);
//    }
//    private void switchPlayer(){
//        currentPlayerIdx = ( currentPlayerIdx + 1) % players.size();
//    }
//    public void play(){
//        do{
//            board.printBoard();
//            Player currentPlayer =currentPlayer();
//
//        }while (true);
//    }
//}