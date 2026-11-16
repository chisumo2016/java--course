package Abstract;
/*
   A class may or may not be abstract method but can still be declared abstract.
   To avoid instantiation of abstract class
 */

abstract class Demo {
    public void f(){
        System.out.println("f() in Demo");
    }
}

class Demo2 extends Demo{}

public class AbstractEx3 {

    public static void main(String[] args) {
        Demo d ;
       // d = new Demo();
        d = new Demo2();
        d.f();
        //System.out.println("main() in AbstractEx3");
    }
}
