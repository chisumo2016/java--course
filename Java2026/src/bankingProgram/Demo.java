package bankingProgram;

import java.util.Random;
import java.util.Scanner;

/***
 * dice roller program
 */
public class Demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("***************************");
        /*1: Declare variables*/
        Random random = new Random();
        int numberOfDice = 0;
        int total = 0;

        /*2: Get # of dice from the user*/
        System.out.print("Enter the # of dice to roll: ");
        numberOfDice = scanner.nextInt();


        /*3: Check if # of dice > 0 */
        if (numberOfDice > 0) {
            /*4: Roll all the dice*/
               for (int i = 0; i < numberOfDice; i++) {
                   // generate random number between 1 and 6
                     int roll = random.nextInt(1,7) ;
                     printDie(roll);
                     System.out.println("You rolled: " + roll);
                   //total += random.nextInt(6) + 1;

                   /*5: Get the total*/
                   total = total + roll; //total += roll; // total = total + roll

               }
                    /*5: Get the total*/
                    System.out.println("Total : " + total);

        }else {
            System.out.println(" # of dice must be greater than 0.");
            return;
        }

        scanner.close();
    }

    static  void printDie(int roll)
    {
        /*5: Display ASCII of dice*/
        String dice1 = """
                     -------
                     |     |
                     |  *  |
                     |     |
                     -------
                      """;

        String dice2 = """
                     -------
                     | *    |
                     |      |
                     |     *|
                     -------
                      """;

        String dice3 = """
                     -------
                     | *    |
                     |   *  |
                     |     *|
                     -------
                      """;

        String dice4 = """
                     --------
                     | *   * |
                     |       |
                     | *   * |
                     --------
                      """;

        String dice5 = """
                     --------
                     | *   * |
                     |   *   |
                     | *   * |
                     --------
                      """;

        String dice6 = """
                     --------
                     | *   * |
                     | *   * |
                     | *   * |
                     --------
                      """;


        //anhance swicth

        switch (roll) {
            case 1 -> System.out.printf(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.printf(dice3);
            case 4 -> System.out.printf(dice4);
            case 5 -> System.out.printf(dice5);
            case 6 -> System.out.printf(dice6);
            default -> System.out.println("Invalid rol");
        }
    }
}
