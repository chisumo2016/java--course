package logicalOperator;

import java.util.Scanner;

/**
 * Logical operators  : comparing two conditions
 && = AND  check more than one  conditions must be true
 || = OR    only one condition must be true
 ! = NOT  opposite of boolean value / does an inverse
 */

public class ValidateUsername {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        //username must be btn 4-12 characters
        //username must not contain spaces or underscores


        String username;

        System.out.print("Enter your new username : ");
        username = scanner.nextLine();

        if (username.length() <  4 || username.length() > 12 ) {

            System.out.println("Username must be between 4 and 12 characters");
            
        } else if (username.contains(" ") || username.contains("_")) {

            System.out.println("Username must not contain spaces or underscores");

        } else{

            System.out.println("Username is valid" + username);

        }
        scanner.close();

    }
}
