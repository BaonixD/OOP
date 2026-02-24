package lab2.problem2;


public class Pawn extends Piece {
    public Pawn(Position a) {
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b) {
        int colDiff = a.getColDiff(b);
        // Вычисляем разницу между целевым рядом и текущим
        int rowDiff = b.getRow() - a.getRow();

        // Пешка идет строго по вертикали (colDiff == 0)
        // и строго на 1 клетку вверх (rowDiff == 1)
        return colDiff == 0 && rowDiff == 1;
    }

    // Добавляем метод для обновления позиции после хода
    public void setPosition(Position newPos) {
        this.a = newPos;
    }
}