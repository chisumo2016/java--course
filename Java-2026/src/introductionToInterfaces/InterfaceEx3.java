package introductionToInterfaces;
/*
    1) An interface can extend multiple interfaces (inheritance btn interfaces)
    2) A class can implement multiple interfaces

    NOTE:
       A java class can't extend more than one class, but it can implement multiple interfaces .ONLY BASE CLASS IS ALLOWED

       NO MULTIPLE INHERITANCE IN JAVA

       YOUR EXTEND AN INTERFACE BUT  NO IMPLEMENT AN INTERFACE
 */

interface  A{
    void f();
}

interface B {
    void g();
}

interface  C extends A, B {
    void h();
}

interface D {
    void i();
}

class SomeClass implements  C, D {

    @Override
    public void h() {

    }

    @Override
    public void f() {

    }

    @Override
    public void g() {

    }

    @Override
    public void i() {

    }
}


public class InterfaceEx3 {
    public static void main(String[] args) {
        A a = new SomeClass();
        a.f();

        B b = new SomeClass();
        b.g();

        C c = new SomeClass();
        c.h();
        c.f();
        c.g();
        //c.i(); //isnt a member of C

        D d = new SomeClass();
        d.i();

        SomeClass someClass = new SomeClass();
        someClass.f();
        someClass.g();
        someClass.h();
        someClass.i();
    }
}
