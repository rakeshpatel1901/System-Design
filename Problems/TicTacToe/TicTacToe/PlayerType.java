package TicTacToe;


public enum PlayerType {
    HUMAN,
    BOT;

    public static PlayerType from(String var0) {
        if (var0 == null) {
            throw new IllegalArgumentException("Player type is required");
        } else {
            try {
                return valueOf(var0.trim().toUpperCase());
            } catch (IllegalArgumentException var2) {
                throw new IllegalArgumentException("Unknown player type: " + var0 + " (use HUMAN or BOT)");
            }
        }
    }
}

