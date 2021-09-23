public class Main {
    public static void main(String[] args) {
        char[][] b = new char[5][5];

        FillBoard fill = new FillBoard();
        fill.fillBoard(b);
        PrintBoard board = new PrintBoard();
        board.print(b);
    }
}
