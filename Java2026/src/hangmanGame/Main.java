package hangmanGame;

import java.util.ArrayList;
import java.util.Scanner;

/*
     Hangman Game
 */
public class Main {

    public static void main() {

        String word = "pizza"; //watermelon

        Scanner scanner = new Scanner(System.in);

        /*ArrayList of character*/
        ArrayList<Character> wordState = new ArrayList<>();
        /*track wrong guesses*/
        int wrongGuesses = 0;

        /*put underscore for the letter(pizza) p_z_i_a, will circle ----*/
        for (int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }

        //welcome message
        System.out.println("*************************");
        System.out.println("Welcome to Hangman Game!");
        System.out.println("*************************");

        while(wrongGuesses < 6){

            System.out.println(getHangmanArt(wrongGuesses));

            System.out.print("Word: ");

            for (char c : wordState){
                System.out.print(c + " ");
            }
            System.out.println();

            //User guess letter
            System.out.print("Guess a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);


            //check if guess is match
            if (word.indexOf(guess) >= 0){
                System.out.println("Correct Match!");

                //change the wordstate
                for (int i = 0; i < word.length(); i++){
                    if (word.charAt(i) == guess){
                        //update the wordState
                        wordState.set(i, guess);
                    }
                }
                //win
                if (!wordState.contains('_')){
                    System.out.print(getHangmanArt(wrongGuesses));
                    System.out.println("You win!");
                    System.out.println("The word was: " + word);
                    break;
                }
            }
            else{
                wrongGuesses++;
                System.out.println("Wrong Guess");
            }
        }
        if (wrongGuesses >= 6){
            System.out.print(getHangmanArt(wrongGuesses));
            System.out.println("GAME OVER");
            System.out.println("The word was: " + word);
        }

        //System.out.println(guess);

        //System.out.println(getHangmanArt(6));
        //System.out.println(wordState);

        scanner.close();
    }

    static String getHangmanArt(int wrongGuesses) {
        return switch (wrongGuesses){
            case 0 -> """
                    
                    
                    
                    """;

            case 1 -> """
                     o
                    
                    
                    """;

            case 2 -> """
                     o
                     |
                    
                    
                    """;

            case 3 -> """
                     o
                     /|
                    
                    
                    """;
            case 4 -> """
                     o
                     /|\\
                    
                    
                    """;
            case 5 -> """
                     o
                     /|\\
                    /
                    
                    """;

            case 6 -> """
                     o
                     /|\\
                    / \\
                    
                    """;

            default -> "";


        };
    }
}
