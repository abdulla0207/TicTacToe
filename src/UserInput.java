import java.util.Random;

public class UserInput {

    public void userInput(char[][] b, int placePiece, String user) {
        Random random = new Random();
       char characterXorO = 'c';
       if(user.equals("player")) {
           characterXorO = 'X';
       }else{
           characterXorO = 'O';
       }

        switch (placePiece) {
            case 1:
                if(user.equals("player")){
                    b[0][0] = characterXorO;
                }else if(user.equals("computer")){
                    b[0][0] = characterXorO;
                }
                break;
            case 2:
                if(user.equals("player")) {
                    b[0][2] = characterXorO;
                }else if(user.equals("computer")) {
                    b[0][2] = characterXorO;
                }
                break;
            case 3:
                if(user.equals("player")) {
                    b[0][4] = characterXorO;
                }else if(user.equals("computer")) {
                    b[0][4] = characterXorO;
                }
                break;
            case 4:
                if(user.equals("player")) {
                    b[2][0] = characterXorO;
                }else if(user.equals("computer")) {
                    b[2][0] = characterXorO;
                }
                break;
            case 5:
                if(user.equals("player")) {
                    b[2][2] = characterXorO;
                }else if(user.equals("computer")) {
                    b[2][2] = characterXorO;
                }
                break;
            case 6:
                if(user.equals("player")) {
                    b[2][4] = characterXorO;
                }else if(user.equals("computer")) {
                    b[2][4] = characterXorO;
                }
                break;
            case 7:
                if(user.equals("player")) {
                    b[4][0] = characterXorO;
                }else if(user.equals("computer")) {
                    b[4][0] = characterXorO;
                }
                break;
            case 8:
                if(user.equals("player")) {
                    b[4][2] = characterXorO;
                }else if(user.equals("computer")) {
                    b[4][2] = characterXorO;
                }
                break;
            case 9:
                if(user.equals("player")) {
                    b[4][4] = characterXorO;
                }else if(user.equals("computer")) {
                    b[4][4] = characterXorO;
                }
                break;
            default:
                break;

        }
    }
}
