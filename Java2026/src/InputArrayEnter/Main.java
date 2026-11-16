package InputArrayEnter;

import java.util.Scanner;

/***
 * enter user input into an array
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //String[] foods = new String[3] ;
        String[] foods;
        int size;

        System.out.print("What # of food do you want to enter ? ");
        size = scanner.nextInt();
        scanner.nextLine();

        // Instantiated
        foods = new String[size];

        for (int i = 0; i < foods.length; i++) {
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

        for(String food : foods) {
            System.out.println(food);
        }

        scanner.close();
    }
}
