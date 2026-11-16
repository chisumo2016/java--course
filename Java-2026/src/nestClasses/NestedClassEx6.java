package nestClasses;
/*
    Anonymous classes  : NO NAME
      - A class instantaneously created without a name
 */

interface  Great{
    void sayHello(String name);
}

class MyGreetingImp implements Great{
    @Override
    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }
}
public class NestedClassEx6 {
    public static void main(String[] args) {
//        MyGreetingImp obj = new MyGreetingImp();
//        obj.sayHello("saga");

        Great obj = new MyGreetingImp();
        obj.sayHello("saga");

        //Great obj2 = new MyGreetingImp();
        //obj2.sayHello("sagasssss");

        /** Anonymous classes  - Interface**/
        Great obj1 = new Great() {
            @Override
            public void sayHello(String name) {
                System.out.println("Hello " + name + " from anonymous implementation");
            }
        };

        obj1.sayHello("sagassss");

    }

}
