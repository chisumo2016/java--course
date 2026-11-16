package ArrayListsDemo;

import java.util.ArrayList;
import java.util.Scanner;

/*
    exercise by taking user insput
 */
public class Demo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the # of food you would like :  ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine();

        // For loop to add foods
        for (int i = 1; i <= numOfFood; i++) {

            System.out.print("Enter food #" + i   +": "); //+ (i + 1) + ": ")

            String food = scanner.nextLine();

            //add food to arraylist
            foods.add(food);
        }

        System.out.println(foods);

      scanner.close();
    }
}
