package oops.polymorphism;
/**
 *  PILLAR OF OOPS
     2: Polymorphism : "POLY" - "MANY"
                        "MORPH" - "SHAPE"
                        Many shapes
                        Many forms
           objects can identify as other objects : eg:
                    dog can identify as animal
                    dog can identify as dog
                    dog can identify as organism
                    dog can identify as object
           Objects can be treated as objects of a common superclass
           Can be treated as interface /archived through interface as well

        keyword : extends, abstract
 */
public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        car.go();
        bike.go();
        boat.go();

        System.out.println();

        Vehicle1[] vehicles = {};

        for(Vehicle1 vehicle : vehicles) {
            vehicle.go();
        }
    }
}
