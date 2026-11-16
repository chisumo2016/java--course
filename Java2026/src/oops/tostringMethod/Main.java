package oops.tostringMethod;
/*
     .toString() : Method inherited from Object class .
                 Used to return a string representation of the object.
                 By default, it returns the  hashcode as a unique identifier.
                 It can be overridden to provide meaningful information about the object.

  */
public class Main {

    public static void main(String[] args) {

           Car car = new Car("Toyota", "Camry", 2022, "Blue");
           Car car2 = new Car("Honda", "Accord", 2023, "Red");

           System.out.println(car); // gives hashcode, unique identifier, memory location
           System.out.println(car2); // gives hashcode, unique identifier, memory location

        System.out.println();

        //meaningful information
        //System.out.println(car.color + " " + car.year + " " + car.make + " " + car.model);
    }
}
