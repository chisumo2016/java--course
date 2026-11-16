package compoundInterest;

import java.util.Scanner;

/*
 * This program calculates compound interest.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        double principal ;
        double rate ;
        double timesCompounded ;
        int years ;
        double amount ;

        System.out.print("Enter the principal amount:");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %) :");
        rate = scanner.nextDouble() / 100; //0/7

        System.out.print("Enter the # of times compounded per year:"); //1/4
        timesCompounded = scanner.nextDouble();

        System.out.print("Enter the # of years:");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        //System.out.println("The amount after " + years + " is: $" + amount);
        System.out.printf("The amount after $%d years is %.2f", years , amount);

        scanner.close();

    }
}
