package oops;

/*
    Object-oriented programming 🧱

    Object: An entity that holds data (attributes) and performs actions (methods)
            It is a refence data type
            store is the location called HEAP
 */
public class Main {

    public static void main(String[] args) {


        Car car1 = new Car();

        //Modify the attribute
        //car1.make = "Toyota";

        System.out.println(car1.make);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.price);
        System.out.println(car1.isRunning);

        System.out.println();

        System.out.println(car1.isRunning);
        car1.start();
        System.out.println(car1.isRunning);
        car1.stop();
        System.out.println(car1.isRunning);

        System.out.println();

        car1.drive();
        car1.brake();
        System.out.println();

        Car car2 = new Car();
        //car2.make = "Ford";

        System.out.println(car1.make + " " + car1.model);
        System.out.println(car2.make + " " + car2.model);
    }
}