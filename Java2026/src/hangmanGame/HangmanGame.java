package hangmanGame;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HangmanGame {

    public static void main() {

        String filePath  = "/Users/developer/Documents/java/Java2026/src/hangmanGame/words.txt";

        ArrayList<String> words = new ArrayList<>();

        //read the file
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            //read each line of the file
            while ((line = reader.readLine()) != null) {
                words.add(line.trim());
            }

        }

        catch (FileNotFoundException e){
            System.out.println("Could not find file");

        }

        catch (IOException e){
            System.out.println("Something went wrong");
        }

        Random rand = new Random();
        int randomIndex = rand.nextInt(words.size());
        String word = words.get(randomIndex);
        System.out.println(word);

        //System.out.println(words);

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

            System.out.print(getHangmanArt(wrongGuesses));

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
                System.out.println("Correct Guess!");

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
                    System.out.println("YOU WIN!");
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
