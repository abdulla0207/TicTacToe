import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 2D Array for game board
        char[][] b = new char[5][5];

        // Class that has a method for Making the Game Board
        FillBoard fill = new FillBoard();
        fill.fillBoard(b);

        // Class that has a method for Printing the Game Board to the Console
        PrintBoard board = new PrintBoard();
        board.print(b);

        UserInput input = new UserInput();


        int rand;
        int playerPlacePiece;
        List<Integer> playerPositions = new ArrayList<>();
        List<Integer> computerPositions = new ArrayList<>();

        while(playerPositions.size() < 10){
            if(playerPositions.size() == 8) {
                System.out.println("GAME OVER!");
                break;
            }
            System.out.println("Choose number from 1 - 9");
            playerPlacePiece = scanner.nextInt();
            while(true) {
                if (playerPositions.contains(playerPlacePiece)) {
                    System.out.println("This place is taken. Try again");
                    playerPlacePiece = scanner.nextInt();
                } else {
                    break;
                }
            }
            playerPositions.add(playerPlacePiece);
            input.userInput(b, playerPlacePiece, "player");
            rand = random.nextInt(9) + 1;
            for (int i = 0; true; i++) {
                if (computerPositions.contains(rand) || computerPositions.contains(playerPlacePiece)) {
                    System.out.println("PLACE IS TAKEN");
                    System.out.println("RANDOM " +rand);
                    rand = random.nextInt(9) + 1;
                }else{
                    break;
                }
            }
            playerPositions.add(rand);
            computerPositions.add(rand);
            computerPositions.add(playerPlacePiece);
            input.userInput(b, rand, "computer");
            board.print(b);
            System.out.println("Comp" + computerPositions);
            System.out.println("Player" + playerPositions);
        }
    }
}
