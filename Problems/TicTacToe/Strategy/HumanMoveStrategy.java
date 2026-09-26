package Strategy;

import TicTacToe.Board;
import TicTacToe.Move;
import TicTacToe.PieceType;

import java.util.Scanner;

public class HumanMoveStrategy implements MoveStrategy {
    private final Scanner scanner;

    public HumanMoveStrategy(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public Move makeMove(Board board, PieceType piece) {
        while (true) {
            System.out.print("Enter row and col (0-based, e.g. 0 2): ");
            if (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Please enter two integers.");
                continue;
            }
            int row = scanner.nextInt();
            if (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Please enter two integers.");
                continue;
            }
            int col = scanner.nextInt();
            Move move = new Move(row, col);
            if (board.isEmpty(move)) {
                return move;
            }
            System.out.println("That cell is taken or out of bounds.");
        }
    }
}
