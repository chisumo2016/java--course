package oops.GettterSetter;
/*
   They help protect object data and add rules for accessing or modifying it.

       GETTERS = Methods that make a field READABLE
       SETTERS = Methods that make a field MODIFIABLE
 */
public class Main {
    public static void main(String[] args) {

        Car car = new Car("Red", "BMW", 20000);


        //car.setModel("Toyota");this must be readable only , dont want to changed
        car.setColor("Blue");
        car.setPrice(50000);

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());

    }
}
