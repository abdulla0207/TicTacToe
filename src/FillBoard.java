public class FillBoard {
    // This method loops through the indices of the 2D array and puts relevant symbols to it
    public void fillBoard(char[][] b) {

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                if(i % 2 == 1){
                    if(j % 2 == 0) {
                        b[i][j] = '-';
                    }
                }
                if(i % 2 == 0){
                    if(j % 2 == 1) {
                        b[i][j] = '|';
                    }
                }
                if(i % 2 == 0) {
                    if(j % 2 == 0) {
                        b[i][j] = ' ';
                    }
                }
                if(i % 2 == 1) {
                    if(j % 2 == 1) {
                        b[i][j] = '+';
                    }
                }
            }
        }

    }
}
