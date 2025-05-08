package TicTacToe.statergy;

import TicTacToe.models.Board;
import TicTacToe.models.Player;
import TicTacToe.models.Position;

import java.util.Scanner;

public class HumanPlayerStatergy implements PlayerStatergy{

    private Scanner scanner;
    private String playerName;

    public HumanPlayerStatergy(String playerName){
        this.playerName = playerName;
        this.scanner = new Scanner(System.in);
    }

    @Override
    public Position makeMove(Board board) {
        while (true){
            System.out.printf(
                    "%s, enter your move (row [0-2] and column [0-2]): ", playerName);
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            Position move = new Position(row , col);

            if(board.isValidMode(move)){
                return move;
            }
            System.out.println("In Valid Move");
        }
    }
}