package Abstract;
/*
     A subclass extending an abstract class must override all abstract methods of the base class otherwise it too becomes an abstract class
 */

abstract  class A{
    public void f(){System.out.println("f() in A");}

    public abstract void g();

    public abstract void h();
}

abstract  class B extends A{
    //provide the definition of abstract methods
    public void g(){System.out.println("g() in B");}

}

//concreate
class C extends B{
    public void h(){System.out.println("h() in C");}
}

public class AbstractClassEx2 {

    public static void main(String[] args) {
        A a;

        //a = new A(); // no you cant as its abstract
        //a = new B(); // no you cant as its abstract
        a = new C();
        a.f();
        a.g();
        a.h();
    }
}
