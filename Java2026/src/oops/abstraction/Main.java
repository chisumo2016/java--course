package oops.abstraction;
/*
    PILLARS OF OOP
    2: Abstraction: Hiding the implementation details and showing only the functionality to the user .Think i am teaching how to drive a car.
                   I can't open the bonet and teach how evertyhing works
                    Used to define abstract classes and methods .
                    Abstract classes CAN'T be instantiated directly .
                    Can contain 'abstract' methods (which must be implemented by subclasses).
                    Can contain 'concrete' methods (which are inherited by subclasses).
 */
public class Main {

    public static void main(String[] args) {
       // Shape shape = new Shape(); //Abstract classes CAN'T be instantiated directly .

        Circle circle       = new Circle(3);
        Triangle triangle   = new Triangle(4,5);
        Rectangle rectangle = new Rectangle(4,7);

        System.out.println();
        //concrete
        circle.display();
        triangle.display();
        rectangle.display();

        System.out.println();
        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());

    }


}
