package lab2.problem2;

public class Rook extends Piece {
    public Rook(Position a) { super(a); }

    @Override
    public boolean isLegalMove(Position b) {
        // Ходит либо по горизонтали, либо по вертикали
        return a.getColumn() == b.getColumn() || a.getRow() == b.getRow();
    }
}