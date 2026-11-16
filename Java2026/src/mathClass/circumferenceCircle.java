package mathClass;

import java.util.Scanner;

/*
 * This program calculates the circumference of a circle
     circumference = 2 * Math.pi * r
     area = Math.pi * Math.pow(r, 2);
     volume = (4/3) * Math.pi * Math.pow(r, 3);
 */
public class circumferenceCircle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius of the circle: ");
        radius = scanner.nextDouble();

        circumference  = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume =  (4.0/3.0) * Math.PI * Math.pow(radius, 3);


        System.out.printf("The circumference is: %.1fcm \n" , circumference);
        System.out.printf("The area is: %.1fcm² \n" ,  area );
        System.out.printf("The volume is : %.1fcm³ \n" ,  volume); //0179






        scanner.close();

    }
}
