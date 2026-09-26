package Strategy;

import TicTacToe.Board;
import TicTacToe.Move;
import TicTacToe.PieceType;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomBotStrategy implements MoveStrategy {
    private final Random random = new Random();

    @Override
    public Move makeMove(Board board, PieceType piece) {
        List<Move> emptyCells = new ArrayList<>();
        for (int row = 0; row < board.getSize(); row++) {
            for (int col = 0; col < board.getSize(); col++) {
                Move move = new Move(row, col);
                if (board.isEmpty(move)) {
                    emptyCells.add(move);
                }
            }
        }
        Move chosen = emptyCells.get(random.nextInt(emptyCells.size()));
        System.out.println("Bot plays " + chosen.getRow() + " " + chosen.getCol());
        return chosen;
    }
}
