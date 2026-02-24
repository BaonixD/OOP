package lab2.problem2;

public class Bishop extends Piece {
    public Bishop(Position a) { super(a); }

    @Override
    public boolean isLegalMove(Position b) {
        // Разница в колонках должна быть равна разнице в рядах (диагональ)
        return a.getColDiff(b) == a.getRowDiff(b);
    }
}