package Isaiah;

public class TicTacToe {
//    Build a command line Tic Tac Toe game...
//            - the game board should be a multi-dimensional array of Strings
//    - be sure the board displays the column letter and row number:
//                A   B   C
//            1  -O- --- ---
//            2  --- -X- ---
//            3  --- --- ---
//            - the "O" in the example above is at 1a and the "X" is at 2B
//    - the winning three in a row should match should be drawn with stars instead of dashes:
//                A   B   C
//            1  *O* *O* *O*
//            2  --- -X- ---
//            3  -X- --- ---
//            - player one and player two should alternate turns
//    - be sure to display who's turn it is and who won
public static void main(String[] args) {
    String[][] matrix = {
            {"-", "-", "-"},
            {"-", "-", "-"},
            {"-", "-", "-"}
    };

    System.out.println("    A   B   C ");
    int rowNum = 0;
    for (String[] row : matrix) {
        System.out.println("  +---+---+---+");
        rowNum += 1;
        System.out.print(rowNum +" | ");

        for (String n : row) {
            System.out.print(n + " | ");
        }

        System.out.println();
    }

    System.out.println(" " +
            " +---+---+---+");
}


}
