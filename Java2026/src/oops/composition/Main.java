package oops.composition;

/**
    Composition : Represents a "part of" relationship between objects.
                 For example, an Engine is a "part of a Car".
                 Allows complex objects to be constructed from simpler/small objects.
 */
public class Main {

    public static void main(String[] args) {

        Car car = new Car("Toyota", 2022, "V8");

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);

        car.start();


    }
}
