import TicTacToe.TicTacToeGame;

public class Main {
    public static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame(3);
        game.start("human", "bot");
    }
}
