package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
         Exception handling : An event that interrupts the normal flow of execution of a program.
         (dividing/ by zero, file not found, mismatch input types)
         Surround any dangerous code with try and catch blocks.
            try{}, catch{} , finally{}
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println(number);

            System.out.println(1/0);
        } catch (InputMismatchException e) {
            System.out.println("That wasn't a number");

            throw new RuntimeException(e);
        }
        catch (ArithmeticException e) {
            System.out.println("You can't devide by zero: " + e.getMessage());
        }
        catch (Exception e) {
            //Safety net
            System.out.println("Something went wrong: " + e.getMessage());
        }
        finally {
            scanner.close();
            System.out.println("This always  executes");
        }
    }
}
