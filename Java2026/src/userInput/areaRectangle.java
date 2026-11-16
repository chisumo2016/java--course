package userInput;

import java.util.Scanner;
/**
 * calculate the area of a rectangle
 * */
public class areaRectangle {

    public static void main(String[] args) {

        //  declaring variables
         double length = 0;
         double  width = 0;
         double area = 0;


        System.out.print("Enter the length of the rectangle: ");

        Scanner scanner = new Scanner(System.in);
        length = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter the width of the rectangle: ");
         width = scanner.nextDouble();

        area = length * width;
        System.out.println("The area of the rectangle is: " + area + "cm²");

        scanner.close();
    }
}
