package arithmeticOperation;

/*
 * order of operations
 *
      1. parenthesis
      2. exponentiation
      3. multiplication and
      4. division
      5. addition and subtraction
        P - E - M - D - A - S (please excuse my dear aunt sally)

       From left to right
 * */

public class orderOperation {

    public static void main(String[] args) {

        double result =  3 + 4 * (7 -5 ) /2.0 ;

        System.out.println(result);
    }
}
