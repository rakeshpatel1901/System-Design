package Factory;

import Strategy.HumanMoveStrategy;
import Strategy.MoveStrategy;
import Strategy.RandomBotStrategy;
import TicTacToe.PlayerType;

import java.util.Scanner;

public class MoveStrategyFactory {
    public static MoveStrategy create(PlayerType type, Scanner scanner) {
        switch (type) {
            case HUMAN:
                return new HumanMoveStrategy(scanner);
            case BOT:
                return new RandomBotStrategy();
            default:
                throw new IllegalArgumentException("Unsupported player type: " + type);
        }
    }
}
