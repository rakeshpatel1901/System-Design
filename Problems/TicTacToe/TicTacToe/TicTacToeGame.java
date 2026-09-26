package TicTacToe;

import Factory.MoveStrategyFactory;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class TicTacToeGame {
    private final Board board;
    private final Deque<Player> turnQueue;

    public TicTacToeGame(int size) {
        this.board = new Board(size);
        this.turnQueue = new ArrayDeque<>();
    }

    public void start(String player1Type, String player2Type) {
        Scanner scanner = new Scanner(System.in);
        Player player1 = new Player(
                "Player 1",
                PieceType.X,
                MoveStrategyFactory.create(PlayerType.from(player1Type), scanner)
        );
        Player player2 = new Player(
                "Player 2",
                PieceType.O,
                MoveStrategyFactory.create(PlayerType.from(player2Type), scanner)
        );
        turnQueue.add(player1);
        turnQueue.add(player2);

        board.display();

        while (true) {
            Player current = turnQueue.removeFirst();
            System.out.println(current.getName() + " (" + current.getPiece() + ") to move");

            Move move = current.makeMove(board);
            if (!board.place(move, current.getPiece())) {
                System.out.println("Invalid move. Try again.");
                turnQueue.addFirst(current);
                continue;
            }

            board.display();

            if (board.hasWinner(current.getPiece())) {
                System.out.println(current.getName() + " wins!");
                break;
            }
            if (board.isFull()) {
                System.out.println("Draw!");
                break;
            }

            turnQueue.addLast(current);
        }
    }
}
