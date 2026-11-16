package TwoDArrays;
/*
      1     2       3
      4     5       6
      7     8       9
      *     0       #
 */
public class TelephoneNumber {

    public static void main(String[] args) {

        char[][] telephone = {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
                {'*', '0', '#'}
        };

        //Display by nested loops
        for (char[] row : telephone) { // outer loop row
            for (char number : row) {
                System.out.print(number + "  ");
            }
            System.out.println();
        }
    }
}
