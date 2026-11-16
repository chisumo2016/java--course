package dynamicBinding;

/**
    Overriding and method invocation
    Dynamic binding
              binding/linking to the corresponding method definition based on object type
 */

class Base{
    void f(){
        System.out.println("f() in Base");
    }

    void g(){
        System.out.println("g() in Base");
    }


}

class Derived extends Base{
    void f(){
        System.out.println("f() in Derived");
    }

    void h(){
        System.out.println("h() in Derived");
    }
}
public class InheritanceEx1 {

    public static void main(String[] args) {

//        Base b1 = new Base();
//        b1.f();  // f() in Base
//        b1.g(); // g() in Base
//
//        System.out.println();
//
//        Base b2 = new Derived();  // compiler knows the Base not derived
//        b2.f();  // f() in Derived
//        b2.g(); // g() in Base
//        //b2.h();

        test(new Derived());

    }

    static void test(Base b){
        b.f();
        b.g();
        if (b instanceof Derived){  // stop exception
            ((Derived)b).h();  //type casting
        }

       //b.h();
    }
}
