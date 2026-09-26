package TicTacToe;

import Strategy.MoveStrategy;

public class Player {
    private final String name;
    private final PieceType piece;
    private final MoveStrategy strategy;

    public Player(String name, PieceType piece, MoveStrategy strategy) {
        this.name = name;
        this.piece = piece;
        this.strategy = strategy;
    }

    public String getName() {
        return name;
    }

    public PieceType getPiece() {
        return piece;
    }

    public Move makeMove(Board board) {
        return strategy.makeMove(board, piece);
    }
}
