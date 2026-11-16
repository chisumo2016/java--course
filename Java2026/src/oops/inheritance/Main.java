package oops.inheritance;

import java.lang.classfile.attribute.SourceDebugExtensionAttribute;

/*
    PILLARS OF OOP
   1:  Inheritance: One class inherits the attributes and methods of another class
    Child class inherits the attributes and methods of parent class
        Child <---------Parent (child can inherit traits from parent)
        Child <---------Parent <----------GrandParent

       we use the extends keyword to inherit traits from parent
  */
public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        Plant plant = new Plant();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);

        System.out.println();

        dog.eat();
        cat.sleep();

        System.out.println();

        System.out.println(dog.lives);
        System.out.println(cat.lives);

        System.out.println();

        dog.speak();
        cat.speak();

        System.out.println();

        System.out.println(plant.isAlive);
        plant.photosynthesis();


    }
}
