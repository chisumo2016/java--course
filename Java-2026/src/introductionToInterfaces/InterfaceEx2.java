package introductionToInterfaces;
/*
    1) A class must IMPLEMENT all ABSTRACT methods of an INTERFACE otherwise it must be declared/become ABSTRACT
    2) Method invocation based on interface .
 */

interface Sample{
    void f();
    void g();
}

abstract class Base implements Sample{
     public void f(){System.out.println("f() in Base");}
     public abstract void h(); // depends with use case how you're to define
}

class Derived extends Base{

     public void g(){System.out.println("g() in Derived");}
     public void h(){System.out.println("h() in Derived");}
     public void i(){System.out.println("i() in Derived");}
}
public class InterfaceEx2 {
    public static void main(String[] args) {
        //methods invocations and how it works
        Derived d1 = new Derived(); // it has all answers
        d1.f();
        d1.g();
        d1.h();
        d1.i();

        System.out.println();

        // member defination are available in Base
        Base b1 = d1; // YOU CANT CALL i() method
        b1.f();
        b1.g();
        b1.h();
        //b1.i(); // isnt the member of Base

        System.out.println();

        Sample s1 = d1;
        s1.f();
        s1.g();
        //s1.h();

    }
}
