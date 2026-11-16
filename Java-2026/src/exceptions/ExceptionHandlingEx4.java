package exceptions;

/*
    1) When an Exception is thrown it must be caught or declared to be thrown (using throws)
    2) Exception class hierarchy
         Throwable
            1)Error (indicate serious problems) used very carefully
            2)Exception
                RuntimeException  (indicate serious problems)
                  NullPointerException
                  ArrayIndexOutOfBoundsException
            IOException
            SQLException
            ClassNotFoundException
            ...
     3) Error and RuntimeException  objects are exempted from handling hence they are unchecked exceptions, for rest of the
       types handling is mandatory hence  they are checked exceptions.

     4) Multiple Exceptions can be caught or thrown using base types .

 */

class MyException extends Error  {} //MyException Exception RuntimeException
class MyException2 extends Error  {} //MyException Exception RuntimeException
public class ExceptionHandlingEx4 {

    public static  void f(int a) throws MyException, MyException2{ //Exception
       if (a == 1){
           throw new MyException();
       }

       if (a == 2){
           throw new MyException2();
       }

      //throw new MyException();

    }
    public static void main(String[] args)  {
        try {
            f(1);
        }catch (MyException | MyException2 e){ // Exception catching everything
            System.out.println("Handle MyException ,MyException2");
            e.printStackTrace();
        }catch (Exception e){ // default handling

        }

    }
}
