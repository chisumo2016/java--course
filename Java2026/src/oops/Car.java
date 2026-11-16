package oops;

public class Car {

    /*attributes*/
    String make = "Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 30000.0;
    boolean isRunning = false;

    /*method*/
    public void start() {
        isRunning = true;
        System.out.println("You start the engine");
    }

    public void stop() {
        isRunning = false;
        System.out.println("You stop the engine");
    }

    public void drive() {
        System.out.println("You drive the car " + model);
    }

    public void brake() {
        System.out.println("You break the car " + model);
    }
}
