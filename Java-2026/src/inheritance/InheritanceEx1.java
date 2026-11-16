package inheritance;
/*
    Inheritance
    - Mechanism in which one class acquires the properties of another class inorder to extend or modify  the existing functionality.
    - Class being extended is called base class or parent class or super class
    - Class extending the base class is called derived class or child class or sub class
    - Forms an IsA relation with the base class.

    - Derived class inherits all the properties of the base class except the constructors.
    - Derived class inherits all the methods and fields of the base class.

            Child extends BaseClass
 */

//PARENT CLASS
class BasicCalculator{
    public int add(int a, int b){
        return a+b;
    }

    public int subtract(int a, int b){
        return a-b;
    }

    public int multiply(int a, int b){
        return a*b;
    }

    public int divide(int a, int b){
        return a/b;
    }
}

//CHILD CLASS/
class ScientificCalculator extends BasicCalculator{

    private  static  final double PI = 3.14;

    public  double sin(double deg){
        double  rad = deg * PI /180;

        return Math.sin(rad);

    }

}

public class InheritanceEx1 {

    public static void main(String[] args) {

        BasicCalculator bc = new BasicCalculator();
        System.out.println("Testing basic calculator");
        System.out.println(bc.add(10, 20));
        System.out.println(bc.subtract(10, 20));
        System.out.println(bc.multiply(10, 20));
        System.out.println(bc.divide(10, 20));



        ScientificCalculator sc = new ScientificCalculator();
        System.out.println("Testing scientific calculator");
        System.out.println(sc.add(10, 20));
        System.out.println(sc.subtract(10, 20));
        System.out.println(sc.multiply(10, 20));
        System.out.println(sc.divide(10, 20));
        System.out.println(sc.sin(90));

        System.out.println();
        BasicCalculator bc2 = new BasicCalculator();
        System.out.println("Testing basic calculator");
        System.out.println(bc2.add(10, 20));
        System.out.println(bc2.subtract(10, 20));
        System.out.println(bc2.multiply(10, 20));
        System.out.println(bc2.divide(10, 20));

        //Isa
        ScientificCalculator bc3 = new ScientificCalculator();
        System.out.println("Testing scientific calculator");
        System.out.println(bc3.add(10, 20));
        System.out.println(bc3.subtract(10, 20));
        System.out.println(bc3.multiply(10, 20));
        System.out.println(bc3.divide(10, 20));
        System.out.println(bc3.sin(90));

    }
}
