package ternaryOperator;
/*
   ternary  operator? = Return 1 of 2 values if a condition is true

   variable = (condition) ? value1:value2
   variable = (condition) ? ifTrue:ifFalse
 */
public class Demo {

    public static void main(String[] args) {

        int score= 70;
        int number = 3;
        int hours = 13;
        int income = 600000;


        String passOrFail = (score >= 60) ? "PASS "  : "FAIL";
        String evenOrOdd =  (number % 2 == 0) ? "EVEN" : "ODD";
        String timeOfDay =  (hours >= 12) ? "AM" : "PM";
        double taxRate   =    (income >= 400000) ? 0.25 : 0.15;

        System.out.println(passOrFail);
        System.out.println(evenOrOdd);
        System.out.println(timeOfDay);
        System.out.println(taxRate);


    }
}
