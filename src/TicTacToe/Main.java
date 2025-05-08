package TicTacToe;

import TicTacToe.models.TicTacToeGame;
import TicTacToe.statergy.HumanPlayerStatergy;
import TicTacToe.statergy.PlayerStatergy;

public class Main {
    public static void main(String[] args) {
        PlayerStatergy playerXStatergy = new HumanPlayerStatergy("Player X");
        PlayerStatergy playerYStatergy = new HumanPlayerStatergy("Player Y");

        TicTacToeGame game = new TicTacToeGame(playerXStatergy , playerYStatergy , 3 ,3);

        game.play();
    }
}