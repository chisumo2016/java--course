package dynamicBinding;


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
class ScientificCalculator extends BasicCalculator {

    private  static  final double PI = 3.1416;

    public  double sin(double deg){
        double  rad = deg * PI /180;

        return Math.sin(rad);

    }

}
public class InheritanceEx2 {

    public static void main(String[] args){
       test(new BasicCalculator());

        System.out.println();

        test(new ScientificCalculator());
    }

    static  void test(BasicCalculator b){

        System.out.println(b.add(10, 20));
        System.out.println(b.subtract(50, 20));

        if(b instanceof ScientificCalculator){
            System.out.println(((ScientificCalculator) b).sin(90)); //type cast
        }

    }
}

/** Can i make call to sin() method from BasicCalculator class? No  */
