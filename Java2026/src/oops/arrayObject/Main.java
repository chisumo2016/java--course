package oops.arrayObject;
/*
    * Array of objects
 */
public class Main {
    public static void main(String[] args) {

       Car car1 = new Car("BMW" , "Black");
       Car car2 = new Car("Audi" , "White");
       Car car3 = new Car("Mercedes" , "Red");

       // Array
       Car[] cars = { car1 , car2 , car3 };

       // Iteration of array
        for(Car car : cars){
            car.drive();
        }
        /*for(int i = 0 ; i < cars.length ; i++){
            cars[i].drive();
        }*/
    }
}
