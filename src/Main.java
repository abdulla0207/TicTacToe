import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        char[][] b = new char[5][5];


        FillBoard fill = new FillBoard();
        fill.fillBoard(b);


        PrintBoard board = new PrintBoard();
        board.print(b);


        UserInput input = new UserInput();

        int rand;
        int placePiece;
        while(true) {
            System.out.println("Choose number from 1-9");
            placePiece = scanner.nextInt();
            input.userInput(b, placePiece, "player");
            rand = random.nextInt(9) + 1;
            input.userInput(b, rand, "computer");
            board.print(b);
        }
    }
}
