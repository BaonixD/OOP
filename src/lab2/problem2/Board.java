package lab2.problem2;

public class Board {
    private Piece[][] grid;

    public Board() {
        grid = new Piece[8][8]; // 8 рядов (0-7) и 8 колонок (0-7)
    }

    // Метод для установки фигуры на доску
    public void setPiece(int row, int col, Piece p) {
        if (row >= 0 && row < 8 && col >= 0 && col < 8) {
            grid[row][col] = p;
        }
    }

    // Метод для отрисовки доски в консоли
    public void drawBoard() {
        System.out.println("   a b c d e f g h");
        System.out.println("  -----------------");
        for (int i = 7; i >= 0; i--) { // Выводим сверху вниз (с 8-го ряда по 1-й)
            System.out.print((i + 1) + "| ");
            for (int j = 0; j < 8; j++) {
                if (grid[i][j] == null) {
                    System.out.print(". "); // Пустая клетка
                } else {
                    // Выводим первую букву названия класса (R, K, Q, B, N, P)
                    System.out.print(grid[i][j].getClass().getSimpleName().charAt(0) + " ");
                }
            }
            System.out.println("|" + (i + 1));
        }
        System.out.println("  -----------------");
        System.out.println("   a b c d e f g h");
    }

    // Проверка возможности хода с учетом препятствий (для продвинутого бонуса)
    public boolean movePiece(Position from, Position to) {
        Piece p = grid[from.getRow() - 1][from.getColumn() - 'a'];
        if (p != null && p.isLegalMove(to)) {
            // В базовой версии просто перемещаем
            grid[to.getRow() - 1][to.getColumn() - 'a'] = p;
            grid[from.getRow() - 1][from.getColumn() - 'a'] = null;
            p.a = to;
            return true;
        }
        return false;
    }
}
