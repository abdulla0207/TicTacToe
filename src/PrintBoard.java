public class PrintBoard {
    // This method prints the board
    public void print(char[][] b) {

        for (char[] chars : b) {
            for (char board : chars) {
                System.out.print(board);
            }
            System.out.println();
        }
    }

}
