package logicalOperator;

/**
 * Logical operators  : comparing two conditions
    && = AND  check more than one  conditions must be true
    || = OR    only one condition must be true
     ! = NOT  opposite of boolean value
 */
public class Demo {

    public static void main(String[] args) {

        double temp = 20;
        boolean isSunny = false;

        if (temp <= 30 && temp >= 0 && isSunny){
            System.out.println("The weather is GOOD");
            System.out.println("It is SUNNY outside");
        }
        else if (temp <= 30 && temp >= 0 && !isSunny){

            System.out.println("The weather is good");
            System.out.println("It is CLOUDY outside");

        } else if (temp >=30 || temp< 0 ) {
            System.out.println("The weather is BAD");
        }

    }
}
