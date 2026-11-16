package subStrings;

import java.util.Scanner;

/**
 * Weight converter
 */
public class weightConverter {

    public static void main(String[] args) {
        // Weight conversion program

        //Declare variables
        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        //welcome message
        System.out.println("Weight conversion Program");
        System.out.println(" 1 : Convert lbd to kgs");
        System.out.println(" 2 : Convert kgs to lbs");


        //prompt for user choice
        System.out.print("Choice ana option: ");
        choice = scanner.nextInt();


        // option 1 convert lbs to kgs
         if (choice == 1){

             System.out.println("Enter the weight in lbs: ");
             weight = scanner.nextDouble();
             newWeight = weight * 0.453592;

             System.out.printf("The weight in kgs is %.2f: ",  newWeight);
             //System.out.println("The weight in kgs is: " + newWeight);
         }
        // option 2 convert kgs to lbs

        else if (choice == 2){

            System.out.println("Enter the weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;

            System.out.printf("The weight in lbs is %.2f: ",  newWeight);
            //System.out.println("The weight in kgs is: " + newWeight);
        }

        // else print not a valid choice
        else {
            System.out.println("Not a valid choice");
        }

        scanner.close();

    }
}
