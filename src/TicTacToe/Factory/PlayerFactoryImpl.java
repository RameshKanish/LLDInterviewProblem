package TicTacToe.Factory;

import TicTacToe.models.Player;
import TicTacToe.models.Symbol;
import TicTacToe.statergy.PlayerStatergy;

public class PlayerFactoryImpl implements TicTacToe.Factory.PlayerFactory {

    @Override
    public Player createPlayer(Symbol symbol, PlayerStatergy playerStatergy) {
        return new Player(symbol,playerStatergy);
    }
}