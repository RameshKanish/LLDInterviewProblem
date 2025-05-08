package TicTacToe.models;

import TicTacToe.State.*;

public class Board {
    private int row;
    private int col;
    private Symbol [][] grid ;
    public Board(int row , int col){
        this.row = row;
        this.col = col;
        grid = new Symbol[row][col];
        for(int i = 0 ; i < row ;i++){
            for(int j = 0 ; j < col ;j++){
                grid[i][j] = Symbol.EMPTY;
            }
        }
    }

    public void printBoard(){
        for(int i = 0 ; i < row;i++){
            for(int j = 0 ; j < col; j++){
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }
    public boolean isValidMode(Position pos){
        return (pos.row >= 0 && pos.row < grid.length
                && pos.col < grid[0].length && pos.col>= 0
                && grid[pos.row][pos.col] == Symbol.EMPTY);
    }

    public void makeMove(Position pos , Symbol symbol) {
        grid[pos.row][pos.col] = symbol;
        System.out.println("Grid" +  grid[pos.row][pos.col]);
    }


    public void checkGameState(GameContext context){
        // Row Check

        for(int i = 0 ; i < row ; i++){
            if(grid[i][0] != Symbol.EMPTY && isWinningLine(grid[i])){
                GameState newState =
                        grid[i][0] == Symbol.X ? new XwonState() : new OWonState();
                context.setState(newState);
                return;
            }
        }
        // Col Check
        for(int i = 0 ; i < col ; i++){
            Symbol[] col = new Symbol[grid.length];

            for(int j = 0 ; j < grid[i].length ; j++){
                col[j] = grid[j][i];
            }
            if(grid[0][i] != Symbol.EMPTY && isWinningLine(col)){
                GameState newState =
                        col[0] == Symbol.X ? new XwonState() : new OturnState();

                context.setState(newState);
            }
        }

        // Diagonal Check
        Symbol[] mainDiagonal = new Symbol[grid.length];
        Symbol[] secondDiagonal = new Symbol[grid.length];
        int col = grid[0].length;
        for(int i = 0 ; i < grid.length ; i++){
            mainDiagonal[i] = grid[i][i];
            secondDiagonal[i] = grid[i][col - i -1];
        }

        if(mainDiagonal[0] != Symbol.EMPTY && isWinningLine(mainDiagonal)){
            GameState gameState =
                    mainDiagonal[0] == Symbol.X ? new XwonState()  : new OWonState();

            context.setState(gameState);
        }

        if(secondDiagonal[0] != Symbol.EMPTY && isWinningLine(secondDiagonal)){
            GameState gameState =
                    secondDiagonal[0] == Symbol.X ? new XwonState() : new OWonState();

            context.setState(gameState);
        }


        // Draw Check
        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[0].length ; j++){
                if(grid[i][i] == Symbol.EMPTY){
                    context.setState(new InProgressState());
                    return;
                }
            }
        }
        context.setState(new DrawState());
    }
    public boolean isWinningLine(Symbol[] line){
        Symbol first = line[0];
        for (Symbol s : line){
            if(s != first){
                return false;
            }
        }
        return true;
    }
}