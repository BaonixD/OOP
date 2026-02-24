package lab2.problem2;

public class Queen extends Piece {
    public Queen(Position a) { super(a); }

    @Override
    public boolean isLegalMove(Position b) {
        // Сочетает логику Ладьи и Слона
        boolean isRookMove = a.getColumn() == b.getColumn() || a.getRow() == b.getRow();
        boolean isBishopMove = a.getColDiff(b) == a.getRowDiff(b);
        return isRookMove || isBishopMove;
    }
}
