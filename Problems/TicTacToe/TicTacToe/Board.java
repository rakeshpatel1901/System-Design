package TicTacToe;


public class Board {
    private static final char EMPTY = ' ';
    private final char[][] cells;
    private final int size;
    private int filledCount;

    public Board(int var1) {
        if (var1 < 3) {
            throw new IllegalArgumentException("Board size must be at least 3");
        } else {
            this.size = var1;
            this.cells = new char[var1][var1];

            for(int var2 = 0; var2 < var1; ++var2) {
                for(int var3 = 0; var3 < var1; ++var3) {
                    this.cells[var2][var3] = ' ';
                }
            }

        }
    }

    public int getSize() {
        return this.size;
    }

    public boolean isInside(Move var1) {
        return var1.getRow() >= 0 && var1.getRow() < this.size && var1.getCol() >= 0 && var1.getCol() < this.size;
    }

    public boolean isEmpty(Move var1) {
        return this.isInside(var1) && this.cells[var1.getRow()][var1.getCol()] == ' ';
    }

    public boolean place(Move var1, PieceType var2) {
        if (!this.isEmpty(var1)) {
            return false;
        } else {
            this.cells[var1.getRow()][var1.getCol()] = var2.getSymbol();
            ++this.filledCount;
            return true;
        }
    }

    public boolean hasWinner(PieceType var1) {
        char var2 = var1.getSymbol();

        for(int var3 = 0; var3 < this.size; ++var3) {
            if (this.isWinningLine(var2, var3, 0, 0, 1) || this.isWinningLine(var2, 0, var3, 1, 0)) {
                return true;
            }
        }

        return this.isWinningLine(var2, 0, 0, 1, 1) || this.isWinningLine(var2, 0, this.size - 1, 1, -1);
    }

    public boolean isFull() {
        return this.filledCount == this.size * this.size;
    }

    public void display() {
        for(int var1 = 0; var1 < this.size; ++var1) {
            StringBuilder var2 = new StringBuilder();

            for(int var3 = 0; var3 < this.size; ++var3) {
                if (var3 > 0) {
                    var2.append("|");
                }

                var2.append(" ").append(this.cells[var1][var3]).append(" ");
            }

            System.out.println(var2);
            if (var1 < this.size - 1) {
                System.out.println("-".repeat(this.size * 4 - 1));
            }
        }

        System.out.println();
    }

    private boolean isWinningLine(char var1, int var2, int var3, int var4, int var5) {
        for(int var6 = 0; var6 < this.size; ++var6) {
            if (this.cells[var2 + var6 * var4][var3 + var6 * var5] != var1) {
                return false;
            }
        }

        return true;
    }
}
