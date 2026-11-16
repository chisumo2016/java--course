package overloadedMethod;
/*
 * Overloaded methods : Methods that share the same name but have different parameters.
 * unique method signature = name + parameters;
 */
public class Demo {

    public static void main(String[] args) {

        System.out.println(add(1,2, 4));
    }

    static double add(double a , double b){
        return a + b;
    }

    static double add(double a , double b, double c ){
        return a + b + c;
    }

}
