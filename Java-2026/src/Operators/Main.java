package Operators;
/*
    Operators
     1) Arithmetic Operators : + , - , *, /,%, ++ , --
     2) Relational Operators : > , < , >= , <= , == , !=
     3) Logical Operators    : && , || , !
     4) Bitwise Operators    : &, |, ^, ~, <<, >>, >>>
     5) Shift Operators      :
                  << (left shift),
                  >> (right shift with sign bit fill),
                  >>> (unsigned right shift with zero)

     6) Conditional Operators    : ? :


 */
public class Main {

    public static void main(String[] args) {

        int obt = 290;
        int total = 300;
        double per ;

        per  = (double)obt/total * 100;

        System.out.printf("Percentage : %.2f \n", per);



    }
}
