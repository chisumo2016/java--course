package numberGuessing;

import java.util.Random;
import java.util.Scanner;

/***
 * Number guessing game
 */
public class Demo {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess ;
        int attempts = 0;
        int min =1;
        int max =100;
        int randomNumber = random.nextInt(min, max+1) ;

        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number between %d-%d\n" , min ,max + 1);
        //System.out.println("Guess a number between 1 - 10: ");

        do {
                 System.out.print("Enter a guess: ");
                 guess = scanner.nextInt();
                 attempts++;

                if(guess < randomNumber) {
                    System.out.println("TOO HIGH! Try again");
                    //System.out.println("You took " + attempts + " attempts to guess the number");
                    //break;
                }

                else if(guess > randomNumber) {

                    System.out.println("TOO HIGH! ");
                }
                else {
                    System.out.println("CORRECT! The number was wa " + randomNumber);
                    System.out.println("# of attempts: " + attempts);
                }


        }while(guess != randomNumber);

                //System.out.println("You have won");

                //System.out.println("You took " + attempts + " attempts to guess the number");
        scanner.close();


    }
}


