import java.util.ArrayList;
import java.util.List;
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
        List<Integer> resultHolder = new ArrayList<>();

        while(resultHolder.size() < 10) {
            System.out.println("Choose number from 1-9");
            placePiece = scanner.nextInt();
            resultHolder.add(placePiece);
            input.userInput(b, placePiece, "player");
            rand = random.nextInt(9) + 1;
            for (int i = 0; true; i++) {
                if (resultHolder.contains(rand)) {
                    System.out.println("This place is taken");
                    rand = random.nextInt(9) + 1;
                }else{
                    break;
                }
            }
            resultHolder.add(rand);
            input.userInput(b, rand, "computer");
            board.print(b);
        }
    }
}
