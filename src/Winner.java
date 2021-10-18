import java.util.List;

public class Winner {

    public boolean playerWin(List<Integer> playerWinning, int[][] winner) {
        if (playerWinning.contains(winner[0][0]) && playerWinning.contains(winner[0][1]) && playerWinning.contains(winner[0][2])) {
            return true;
        }
        if(playerWinning.contains(winner[1][0]) && playerWinning.contains(winner[1][1]) && playerWinning.contains(winner[1][2])) {
            return true;
        }
        if(playerWinning.contains(winner[2][0]) && playerWinning.contains(winner[2][1]) && playerWinning.contains(winner[2][2])) {
            return true;
        }
        if(playerWinning.contains(winner[3][0]) && playerWinning.contains(winner[3][1]) && playerWinning.contains(winner[3][2])) {
            return true;
        }
        if(playerWinning.contains(winner[4][0]) && playerWinning.contains(winner[4][1]) && playerWinning.contains(winner[4][2])) {
            return true;
        }
        if(playerWinning.contains(winner[5][0]) && playerWinning.contains(winner[5][1]) && playerWinning.contains(winner[5][2])) {
            return true;
        }
        if(playerWinning.contains(winner[6][0]) && playerWinning.contains(winner[6][1]) && playerWinning.contains(winner[6][2])) {
            return true;
        }
        if(playerWinning.contains(winner[7][0]) && playerWinning.contains(winner[7][1]) && playerWinning.contains(winner[7][2])) {
            return true;
        }
        return false;
    }

    public boolean computerWin(List<Integer> computerWinning, int[][] winner){
        if (computerWinning.contains(winner[0][0]) && computerWinning.contains(winner[0][1]) && computerWinning.contains(winner[0][2])) {
            return true;
        }
        if(computerWinning.contains(winner[1][0]) && computerWinning.contains(winner[1][1]) && computerWinning.contains(winner[1][2])) {
            return true;
        }
        if(computerWinning.contains(winner[2][0]) && computerWinning.contains(winner[2][1]) && computerWinning.contains(winner[2][2])) {
            return true;
        }
        if(computerWinning.contains(winner[3][0]) && computerWinning.contains(winner[3][1]) && computerWinning.contains(winner[3][2])) {
            return true;
        }
        if(computerWinning.contains(winner[4][0]) && computerWinning.contains(winner[4][1]) && computerWinning.contains(winner[4][2])) {
            return true;
        }
        if(computerWinning.contains(winner[5][0]) && computerWinning.contains(winner[5][1]) && computerWinning.contains(winner[5][2])) {
            return true;
        }
        if(computerWinning.contains(winner[6][0]) && computerWinning.contains(winner[6][1]) && computerWinning.contains(winner[6][2])) {
            return true;
        }
        if(computerWinning.contains(winner[7][0]) && computerWinning.contains(winner[7][1]) && computerWinning.contains(winner[7][2])) {
            return true;
        }
        return false;
    }
}
