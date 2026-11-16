package userInput;

/*
 * Mad Libs Game
 *
 * This program will ask the user for a series of words and then use those words to create a story.
 *
 */

import java.util.Scanner;

public class madLibsGame {

    public static void main(String[] args) {

        String adjective1 ;
        String noun1 ;
        String verb1 ;
        String adjective2 ;
        String adjective3 ;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a adjective (description) :");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a noun (animal or person) :");
        noun1 = scanner.nextLine();
        System.out.print("Enter a adjective (description) :");
        adjective2 = scanner.nextLine();
        System.out.print("Enter a verb  end with -ing (action):");
        verb1 = scanner.nextLine();
        System.out.print("Enter a adjective (description) :");
        adjective3 = scanner.nextLine();

        System.out.println("\nToday I went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibit , I saw a " + noun1 + " ." );
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + " ! ");
        System.out.println("I was " + adjective3 + " !");


        scanner.close();

    }
}
