package introductionToInterfaces;

/**
   Interface
      - 100% abstract as per old Java versions
      - Java recent editions support adding default and static methods
      - All methods are public abstract by default
      - All fields are public static and final by default
      - Used for
           - Separating interface from implementation
           - As a specification for required methods
           - For constants.
           - As marker interfaces.
      - Any class that implements an interface must override all the abstract methods of the interface,
        otherwise it will be an abstract class.

   Example
    - It's like a menu in a restaurant only lists the items available not concerning how it is implemented;
    - parents may give a list of items(interface) to purchase in a shop

     USE
        implements

 */

interface  Calculator {
    //put data
    double PI = 3.14159265358979323846; // public static final


    //declaration with no method implementation
    int add(int a, int b);  // public abstract
    int subtract(int a, int b);
    double sin(double deg);
}

//implementations / providing the definition
class BasicCalculator implements Calculator {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public double sin(double deg) {
        return Math.sin(deg * PI/180); //Math.toRadians(deg)
    }
}

public class InterfaceEx1 {

    public static void main(String[] args) {

        Calculator calc;  // reference variable

        calc = new BasicCalculator(); // someone can be able to answer
        System.out.println(calc.add(10, 20));
        System.out.println(calc.subtract(10, 20));
        System.out.println(calc.sin(90));
    }
}
