package searchArray;

import java.util.Scanner;

public class userInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String[] fruits = {"apple", "banana", "orange", "grape"};
        boolean isFound = false;
        String target;


        System.out.print("Enter the fruit to search for:");
        target = scanner.nextLine();

        //linear search
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals(target)) {
                System.out.println("Element found at index " + i);
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("Element not found is the array");
        }
        scanner.close();
    }
}
