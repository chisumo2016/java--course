package nestClasses;

class Base {
    public void f(){
        System.out.println("f() in Base");
    }

    public void g(){
        System.out.println("g() in Base");
    }
}
public class NestedClassEx9 {
    public static void main(String[] args) {
        Base b = new Base();
        b.f();
        b.g();

        //Subclass of Base and start overriding certain methods
        Base b2 = new Base(){
            @Override
            public void g(){
                System.out.println("g() in anonymous derived");
            }
        };

        b2.f();
        b2.g();
    }

//    public static Base myanonymousConstructor(){
//        return new Base(){
//            @Override
//            public void g(){
//                System.out.println("g() in anonymous derived");
//            }
//        };
//    }
}
