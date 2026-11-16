package oops.arrayObject;
/*
   Anonymous Object  Car(constructor)
 */
public class anonomousObject {

    public static void main(String[] args) {

        Car[] cars = {
                    new Car("BMW" , "Black"),
                    new Car("Audi" , "White"),
                    new Car("Mercedes" , "Red")
                };

        for(Car car : cars){
            car.drive();
            car.color = "black";
        }

        for(Car car : cars){
            car.drive();

        }
    }
}
