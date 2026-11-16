package exceptions;
/*
    Exception Handling
        Are special kind of errors  or failure conditions in the code which need to be caught and handled properly.

        STOP EXECUTION
        The program will stop executing when an exception occurs.

        EXCEPTION HANDLING
        The process of handling exceptions is called exception handling.

        Stack place
        The stack trace is a list of method calls that led to the exception.
 */
public class ExceptionHandlingEx1 {
     static  int div(int a , int b ){

         try { // block where exception can occur

             return a/b;

         } catch (ArithmeticException e) { //HANDLE
             System.out.println("Caught ArithmeticException ");
             return 0;
         }
     }

    public static void main(String[] args) {
        System.out.println(div(10,2));
        System.out.println(div(10,0));
    }
}
