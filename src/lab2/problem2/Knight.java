package lab2.problem2;

public class Knight extends Piece {
    public Knight(Position a) { super(a); }

    @Override
    public boolean isLegalMove(Position b) {
        int colDiff = a.getColDiff(b);
        int rowDiff = a.getRowDiff(b);
        // "Буква Г": (2 и 1) или (1 и 2)
        return (colDiff == 2 && rowDiff == 1) || (colDiff == 1 && rowDiff == 2);
    }
}