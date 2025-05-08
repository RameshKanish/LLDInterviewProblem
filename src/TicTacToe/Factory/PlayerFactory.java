package TicTacToe.Factory;

import TicTacToe.models.Player;
import TicTacToe.models.Symbol;
import TicTacToe.statergy.PlayerStatergy;

public interface PlayerFactory {
    Player createPlayer(Symbol symbol , PlayerStatergy playerStatergy);
}