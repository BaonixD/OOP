package lab2.problem2;

import java.util.Scanner;

public class ChessGame {
    public static void main(String[] args) {
        Board board = new Board();

        // Расставляем фигуры разных типов
        board.setPiece(0, 0, new Rook(new Position('a', 1)));   // Ладья
        board.setPiece(0, 1, new Knight(new Position('b', 1))); // Конь
        board.setPiece(0, 2, new Bishop(new Position('c', 1))); // Слон
        board.setPiece(0, 3, new Queen(new Position('d', 1)));  // Ферзь
        board.setPiece(0, 4, new King(new Position('e', 1)));   // Король

        // Добавим пару пешек на вторую горизонталь
        board.setPiece(1, 0, new Pawn(new Position('a', 2)));
        board.setPiece(1, 3, new Pawn(new Position('d', 2)));
        board.setPiece(1, 6, new Pawn(new Position('g', 2)));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            board.drawBoard();
            System.out.println("Введите ход (например: a2 a3) или 'exit':");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) break;

            String[] parts = input.split(" ");
            if (parts.length != 2) {
                System.out.println("Введите координаты через пробел!");
                continue;
            }

            try {
                Position from = new Position(parts[0].charAt(0), Character.getNumericValue(parts[0].charAt(1)));
                Position to = new Position(parts[1].charAt(0), Character.getNumericValue(parts[1].charAt(1)));

                if (board.movePiece(from, to)) {
                    System.out.println("Ход выполнен успешно!");
                } else {
                    System.out.println("Ошибка: Нелегальный ход для этой фигуры!");
                }
            } catch (Exception e) {
                System.out.println("Ошибка ввода! Формат: a1 a2");
            }
        }
        scanner.close();
    }
}