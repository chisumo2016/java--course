package Abstract;
/*
    Abstract classes
        - Cannot be instantiated
        - They are declared abstracted and may or may not include abstract methods
        - They can be subclassed
        - Abstract classes and abstract methods cannot be final.
        - If you dont provide any definition for an abstract method, you must declare the class containing it abstract.
                Example public void g();
                The class containing abstract methods must be declared abstract.
                This is subclass of Base
   Concrete classes
       - Classes which an be instantiated


 */

abstract class Base {
    public void f(){
        System.out.println("f() in Base");
    }

    public abstract void g(); // abstract method
}

//concrete class
class  Derived extends Base {
    @Override
    public void g(){
        System.out.println("g() in Derived");
    }
}
public class AbstractClassEx1 {

    public static void main(String[] args) {
            Base b; // reference variable , object of type Base
            //b = new Base();  // error
            b = new Derived();  // error
            b.f();
            b.g();

        System.out.println();

            Derived d = new Derived();
            d.f();
            d.g();
    }
}
