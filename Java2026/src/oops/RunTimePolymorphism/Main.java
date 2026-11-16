package oops.RunTimePolymorphism;

import java.util.Scanner;

/*
   Runtime Polymorphism / Dynamic Polymorphism :
          When the method that gets executed is decided at runtime based on the actual type of the object
           eg new Dog() or new Cat()

            Encapsulation → protect data
            Inheritance   → reuse behaviour
            Polymorphism  → vary behaviour
            Abstraction   → hide complexity
 */

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        Animal animal; //before we run the program , we don't know what type of animal it will be/create

        System.out.print("Would you like a dog or a cat? (1= dog or 2= cat): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            animal = new Dog();  //based on the actual type of the object
            animal.speak();
        } else if (choice == 2) {
            animal = new Cat();
            animal.speak();
        }

        scanner.close();

    }
}
