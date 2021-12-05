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
        // Lists to store taken positions in board for user and computer
        List<Integer> playerPositions = new ArrayList<>();
        List<Integer> computerPositions = new ArrayList<>();
        List<Integer> playerWinning = new ArrayList<>();
        List<Integer> computerWinning = new ArrayList<>();

        Winner winner = new Winner();

        // The array of winning positions
        int[][] winPositions = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {1, 5, 9},
                {3, 5, 7},
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}
        };

        while(playerPositions.size() < 10){
            if(winner.computerWin(computerWinning, winPositions)){
                System.out.println("COMPUTER WON!");
                break;
            }else if(winner.playerWin(playerWinning, winPositions)){
                System.out.println("PLAYER WON!");
                break;
            }
            if(!winner.playerWin(playerWinning, winPositions) && !winner.computerWin(computerWinning, winPositions)) {
                //Checks the size of positions, and if it is 8 than Game Ends.
                if(playerPositions.size() == 8){
                    if(!winner.computerWin(computerWinning, winPositions)){
                        System.out.println("GAME OVER! TIE");
                        break;
                    }
                }
                System.out.println("Choose number from 1 - 9");
                playerPlacePiece = scanner.nextInt();
                if (playerPlacePiece > 9) {
                    System.out.println("PLEASE CHOOSE NUMBER FROM 1 - 9\nTRY AGAIN!");
                    playerPlacePiece = scanner.nextInt();
                }
                //Checks if the place is valid for PLayer
                while (true) {
                    if (playerPositions.contains(playerPlacePiece)) {
                        System.out.println("This place is taken. Try again");
                        playerPlacePiece = scanner.nextInt();
                    } else {
                        break;
                    }
                }
                playerWinning.add(playerPlacePiece);
                rand = random.nextInt(9) + 1;
                computerPositions.add(playerPlacePiece);
                playerPositions.add(playerPlacePiece);
                input.userInput(b, playerPlacePiece, "player");
                //Checks if the place is valid for Computer
                while (true) {
                    if (computerPositions.contains(rand)) {
                        rand = random.nextInt(9) + 1;
                    } else {
                        break;
                    }
                }
                computerWinning.add(rand);
                playerPositions.add(rand);
                computerPositions.add(rand);
                input.userInput(b, rand, "computer");
                board.print(b);
            }
        }
    }
}
