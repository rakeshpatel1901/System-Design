package TicTacToe;

public enum PieceType {
    X('X'),
    O('O');

    private final char symbol;

    private PieceType(char var3) {
        this.symbol = var3;
    }

    public char getSymbol() {
        return this.symbol;
    }
}

