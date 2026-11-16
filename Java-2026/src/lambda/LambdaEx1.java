package lambda;

/**
    Lambda Expressions
        - Anonymous classes seems a bit excessive and cumbersome with only one method to implement .
        - Lambda expressions provide a more concise way to implement functional interfaces.
        - Lambda expressions let you express that more compactly.
 */

interface  MyMath{
    int add(int a, int b);
}

//Implementation of MyMath interface using a lambda expression
class MyMathImpl implements MyMath{
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}
public class LambdaEx1 {

    public static void main(String[] args) {

        MyMath m1 = new MyMathImpl();
        System.out.println(m1.add(10, 20));

        System.out.println();

        //1: Approach : Anonymous - using the anonymous class implementation
        MyMath m2 = new MyMath() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };
        System.out.println(m2.add(40, 20));

        System.out.println();

        //2: Approach : Lambda expression - using the lambda expression implementation MyMath m3 = (interface)-> { return a + b };
        System.out.println("Lambda");

        MyMath m3 = (a, b) -> a + b;
        System.out.println(m3.add(60, 20));
    }

}
