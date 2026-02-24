package lab2.problem2;

public class Position {
    private char column; // a, b, c, d, e, f, g, h
    private int row;     // 1, 2, 3, 4, 5, 6, 7, 8

    public Position(char column, int row) {
        this.column = column;
        this.row = row;
    }

    public char getColumn() { return column; }
    public int getRow() { return row; }

    // Разница по горизонтали (колонки)
    public int getColDiff(Position other) {
        return Math.abs(this.column - other.getColumn());
    }

    // Разница по вертикали (ряды)
    public int getRowDiff(Position other) {
        return Math.abs(this.row - other.getRow());
    }
}