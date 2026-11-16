package inheritanceVsComposition;
/*
   This is a composition example where ScientificCalculator has-a BasicCalculator
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

// ScientificCalculator has-a BasicCalculator
class ScientificCalculator {

    private  static  final double PI = 3.14;

    BasicCalculator bc = new BasicCalculator();

    public int add(int a, int b){
        return bc.add(a,b);
    }

    public int subtract(int a, int b){
        return bc.subtract(a,b);
    }

    public int multiply(int a, int b){
        return bc.multiply(a,b);
    }

    public int divide(int a, int b){
        return bc.divide(a,b);
    }

    public  double sin(double deg){
        double  rad = deg * PI /180;

        return Math.sin(rad);

    }

}

public class Compostion3x1{

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

