package userInput;

import java.util.Scanner;

/*User Input: Scanner object
    scanner is class
    scanner.next();
    scanner.nextLine();
* */

public class Demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*user prompt*/
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        /*user prompt - Integer no*/
        System.out.print("Enter your age:  ");
        int age = scanner.nextInt();

        /*user prompt - Double no*/
        System.out.print("What is your gpa:  ");
        double gpa= scanner.nextDouble();

        /*user prompt - Bolean*/
        System.out.print("Are you a student ? (true / false)  ");
        boolean isStudent= scanner.nextBoolean();


        //COMMON MISTAKE
        System.out.print("Enter your year");
        int year = scanner.nextInt();
        scanner.nextLine(); // clear the input line

        System.out.print("Enter your favorite color");
        String color = scanner.nextLine();
        //======end



        System.out.println("Hello " + name + " ");
        System.out.println("You are " + age + " years old");
        System.out.println("You gpa  is " + gpa);
        System.out.println("Student:  " + isStudent);

        if (isStudent)
            System.out.println("Welcome to the student community!");
        else
            System.out.println("Welcome to the non-student community!");

        System.out.println("Your year is " + year);
        System.out.println("Your favorite color is " + color);
        scanner.close();
    }
}
