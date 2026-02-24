package lab2.problem2;

public class King extends Piece {
    public King(Position a) { super(a); }

    @Override
    public boolean isLegalMove(Position b) {
        int colDiff = a.getColDiff(b);
        int rowDiff = a.getRowDiff(b);
        // На 1 клетку в любую сторону, но не стоять на месте
        return (colDiff <= 1 && rowDiff <= 1) && !(colDiff == 0 && rowDiff == 0);
    }
}