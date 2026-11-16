package branchingStatement;

/**
    Branching Statements

      1) if (condition)
            statement1
         else
           statement2

      2)

        switch(expression)
          case value: statements
            break;
          default:statements
            break;
 */
public class Main {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        if (a > b) {
            System.out.println("a is big");
        } else if (a < b) {
            System.out.println("b is big ");
        } else {
            System.out.println("a is equal to b ");
        }

        int day = 1;

        switch(day) {
            case 1: System.out.println("Monday");
                break;
            case 2: System.out.println("Tuesday");
                break;
            default: System.out.println("Invalid day");
                break;
        }

        // new syntax
        int day1 = 2;

        switch(day1) {
            case 1 -> System.out.println("Monday");

            case 2 -> System.out.println("Tuesday");

            default -> System.out.println("Invalid day");

        }
    }
}
