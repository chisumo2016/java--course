package hangmanGame;


import java.util.Scanner;
import java.util.Random;

public class Hangman {
    public static void main(String[] args) {
        String[] words = {"JAVA", "PYTHON", "COMPUTER", "PROGRAMMING", "DEVELOPER"};

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String word = words[random.nextInt(words.length)];
        char[] guessedWord = new char[word.length()];

        for (int i = 0; i < guessedWord.length; i++) {
            guessedWord[i] = '_';
        }

        int attempts = 6;
        boolean won = false;

        System.out.println("=== HANGMAN GAME ===");

        while (attempts > 0) {
            System.out.println("\nWord: " + String.valueOf(guessedWord));
            System.out.println("Attempts remaining: " + attempts);
            System.out.print("Guess a letter: ");

            String input = scanner.nextLine().trim().toUpperCase();

            if (input.length() != 1 ||
                    !Character.isLetter(input.charAt(0))) {
                System.out.println("Enter a single letter.");
                continue;
            }

            char guess = input.charAt(0);
            boolean correct = false;

            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == guess) {
                    guessedWord[i] = guess;
                    correct = true;
                }
            }

            if (!correct) {
                attempts--;
                System.out.println("Incorrect guess!");
            } else {
                System.out.println("Correct guess!");
            }

            if (String.valueOf(guessedWord).equals(word)) {
                won = true;
                break;
            }
        }

        if (won) {
            System.out.println("\nYou won! The word was " + word);
        } else {
            System.out.println("\nGame over! The word was " + word);
        }

        scanner.close();
    }
}

