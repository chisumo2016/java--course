package arithmeticOperation;

import java.util.Scanner;

/**Shopping cart program*/


public class shoppingCart {

    public static void main(String[] args) {

        String item ;
        double price ;
        int quantity ;
        char currency = '$';

        double total ;

        Scanner scanner = new Scanner(System.in);

        //User Input
        System.out.print("What item would you like to buy ? : ");
        item = scanner.nextLine();


        System.out.print("What is the price for each ? : ");
        price = scanner.nextDouble();

        System.out.print("How many would you like to buy ? : ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("\nYou have bought  " + quantity + " " + item + "/s " );
        System.out.println("Your total is " + currency  + total);


        //System.out.println(price);




        scanner.close();
    }
}
