package TicTacToe;


public final class Move {
    private final int row;
    private final int col;

    public Move(int var1, int var2) {
        this.row = var1;
        this.col = var2;
    }

    public int getRow() {
        return this.row;
    }

    public int getCol() {
        return this.col;
    }
}

