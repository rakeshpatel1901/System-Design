package Strategy;

import TicTacToe.Board;
import TicTacToe.Move;
import TicTacToe.PieceType;

public interface MoveStrategy {
    Move makeMove(Board board, PieceType piece);
}
