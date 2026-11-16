package quizGame;

import java.util.Random;
import java.util.Scanner;

/*
 * rock paper scissors
 */
public class rockPaper {

    public static void main(String[] args) {

   /**Declare variables*/
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playChoice;
        String computerChoice;
        String playAgain = "yes";

        do {
            /**Get choice from the user*/
            System.out.println("Enter your move (rock, paper, or scissors): ");
            playChoice = scanner.nextLine().toLowerCase();

            if (!playChoice.equals("rock") && !playChoice.equals("paper") && !playChoice.equals("scissors")){
                System.out.println("Invalid choice. Please enter rock, paper, or scissors.");
                continue;
            }
            /**Get a random choice for the computer*/
            computerChoice = choices[random.nextInt(3)]; //choices.length
            System.out.println("Computer choice : " + computerChoice);

            /**Check win conditions*/
            if (playChoice.equals(computerChoice)){
                System.out.println("It's a tie!");
            } else if ((playChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (playChoice.equals("paper") && computerChoice.equals("rock")) ||
                    (playChoice.equals("scissors") && computerChoice.equals("paper"))){
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
            /**Ask to play again? */
            System.out.println("Do you want to play again? (yes/no)");
            playAgain = scanner.nextLine().toLowerCase();
//            if (!playAgain.equals("yes")){
//                /** Goodbye Message? */
//                System.out.println("Goodbye!");
//                return;
//            }

        }while (playAgain.equals("yes"));

        /** Goodbye Message? */
        System.out.println("Thank you for playing!");
      scanner.close();
    }
}
