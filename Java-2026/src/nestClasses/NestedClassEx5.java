package nestClasses;
/*
   Local classes
    - Classes which are local to a method or block
    - They can only access to the FINAL and effectively final variables

    Anonymous classes
      - A class instantaneously created without a name
 */
public class NestedClassEx5 {

    static  void test(){

       String name = "John";

        class LocalClass {
            public void sayHello(){
                System.out.println("helo !! " + name);
            }
        }

        LocalClass Obj = new LocalClass();
        Obj.sayHello();
    }

    public static void main(String[] args) {

        test();

    }
}
