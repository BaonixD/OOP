package lab2.problem2;



public abstract class Piece {
    protected Position a; // Текущая позиция фигуры

    public Piece(Position a) {
        this.a = a;
    }

    // Тот самый метод, который мы будем переопределять
    public abstract boolean isLegalMove(Position b);
}