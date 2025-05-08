package TicTacToe.models;

import TicTacToe.statergy.PlayerStatergy;

public class Player {
    private PlayerStatergy playerStatergy;
    private Symbol playerSymbol;

    public PlayerStatergy getPlayerStatergy() {
        return playerStatergy;
    }

    public void setPlayerStatergy(PlayerStatergy playerStatergy) {
        this.playerStatergy = playerStatergy;
    }

    public Player(Symbol symbol , PlayerStatergy playerStatergy){
        this.playerSymbol = symbol;
        this.playerStatergy = playerStatergy;
    }

    public Symbol getPlayerSymbol() {
        return playerSymbol;
    }

    public void setPlayerSymbol(Symbol playerSymbol) {
        this.playerSymbol = playerSymbol;
    }
}