package LoopingStatement;
/*
    Looping Statement
      1) while(condition = true) statement

      2) do-while(condition) statement

      3) for(initialization; condition; increment) statement
 */
public class Main {

    public static void main(String[] args) {

       int i = 1;

       while(i <= 15) {
           System.out.println("Hello while " + i);
           i++;
       }

         i = 10;
       do {
           System.out.println("runs once a do-while " + i);
           i++;
       } while(i < 5);


       for(int j = 1; j <= 10; j++) {
           System.out.println("it is for .......... " + j);
       }

       // break and continue
    }
}
