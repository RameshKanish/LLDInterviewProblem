package TicTacToe.statergy;

import TicTacToe.models.Board;
import TicTacToe.models.Position;


public interface PlayerStatergy {
    Position makeMove(Board board);
}