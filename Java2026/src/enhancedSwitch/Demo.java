package enhancedSwitch;

import java.util.Scanner;

/*
     enhanced switch: A replacement to many else if statements (java 14 feature)
 */
public class Demo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day of the week");

        String day = scanner.nextLine();   //String day = "Sunday";

        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It is a weekday");

            case "Saturday", "Sunday" -> System.out.println(day + " is not a day");

            default -> System.out.println(day + " is not a day");
        }



        /*switch (day){
            case "Monday"       -> System.out.println("It is a weekday");
            case "Tuesday"      -> System.out.println("It is a weekday");
            case "Wednesday"    -> System.out.println("It is a weekday");
            case "Thursday"     -> System.out.println("It is a weekday");
            case "Friday"       -> System.out.println("It is a weekday");
            case "Saturday"     -> System.out.println("It's the weekend ");
            case "Sunday"       -> System.out.println("It's the  weekend ");
            default             -> System.out.println(day + " is not a day");
        }*/

        //scanner.close();


    }
}


//if (day.equals("Monday")){
//
//        System.out.println("It's weekday !");
//
//        } else if (day.equals("Tuesday")) {
//
//        System.out.println("It's weekday ");
//        }
//
//                else if (day.equals("Wednesday")) {
//
//        System.out.println("It's weekday ");
//        }
//
//                else if (day.equals("Thursday")) {
//
//        System.out.println("It's weekday ");
//        }
//
//                else if (day.equals("Friday")) {
//
//        System.out.println("It's weekday ");
//        }
//
//                else if (day.equals("Saturday")) {
//
//        System.out.println("It's weekend ");
//        }
//
//                else if (day.equals("Sunday")) {
//
//        System.out.println("It's weekend ");
//        }
//
//                else {
//                System.out.println(day + "is not a day");
//        }