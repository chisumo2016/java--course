package whileLoop;

import java.util.Scanner;

public class ageCalcDoLoop {

    public static  void  main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int age = 0;

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        do{
            System.out.println("Your age cant be negative.");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();

        }while(age < 0);

        System.out.println("You are  " + age + " years old.");

        scanner.close();

    }

}
