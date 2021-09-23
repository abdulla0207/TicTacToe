public class UserInput {

    public void userInput(char[][] b, int placePiece, String user) {
       char symbol = 'c';

        switch (placePiece) {
            case 1:
                if(user.equals("player")){
                    b[0][0] = 'X';
                }else if(user.equals("computer")){
                    b[0][0] = 'O';
                }
                break;
            case 2:
                if(user.equals("player")) {
                    b[0][2] = 'X';
                }else if(user.equals("computer")) {
                    b[0][2] = 'O';
                }
                break;
            case 3:
                if(user.equals("player")) {
                    b[0][4] = 'X';
                }else if(user.equals("computer")) {
                    b[0][4] = 'O';
                }
                break;
            case 4:
                if(user.equals("player")) {
                    b[2][0] = 'X';
                }else if(user.equals("computer")) {
                    b[2][0] = 'O';
                }
                break;
            case 5:
                if(user.equals("player")) {
                    b[2][2] = 'X';
                }else if(user.equals("computer")) {
                    b[2][2] = 'O';
                }
                break;
            case 6:
                if(user.equals("player")) {
                    b[2][4] = 'X';
                }else if(user.equals("computer")) {
                    b[2][4] = 'O';
                }
                break;
            case 7:
                if(user.equals("player")) {
                    b[4][0] = 'X';
                }else if(user.equals("computer")) {
                    b[4][0] = 'O';
                }
                break;
            case 8:
                if(user.equals("player")) {
                    b[4][2] = 'X';
                }else if(user.equals("computer")) {
                    b[4][2] = 'O';
                }
                break;
            case 9:
                if(user.equals("player")) {
                    b[4][4] = 'X';
                }else if(user.equals("computer")) {
                    b[4][4] = 'O';
                }
                break;
            default:
                break;

        }
    }
}
