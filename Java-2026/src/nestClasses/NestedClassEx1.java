package nestClasses;
/*
   Nested Classes - A class written with in another class
                    better for encapsulation
                    code looks much better
      class OuterClass {
        .......
     class NestedClass {
            .....
     }
}

 Two Types of Nested Classes
    1)Static Nested Class
       - Nested classes are declared as static
       - Like static methods they can access only static members of outer class directly with out object

   2) Non-static nested class
       - Non static nested classes are called inner class
       - They can access the members of outer class directly .


       example
                class OuterClass {
                    static int x;
                    int y;

                    static class StaticNestedClass {
                        ... can refer x
                    }

                    //Non-static Nested class - also called as inner class
                     class InnerClass {
                        ... can refer to x and y
                    }
                }

                static can access other members of outer class directly with out object


     Instantiation -
         1) static nested class object
            OuterClass.StaticNestedClass obj = new OuterClass.StaticNestedClass();
         2) non-static nested class object
            OuterClass outerObj = new OuterClass();
            OuterClass.InnerClass obj = obj.new InnerClass();

 */

class OuterClass{
    private int x = 10;

    public void test(){
        Demo d = new Demo();
        d.display();
    }

    //inner class  ; non-static  - Object
    class Demo{
        public void display(){
            System.out.println("the value of x is " + x);
        }
    }
}
public class NestedClassEx1 {

    public static void main(String[] args){
        OuterClass obj = new OuterClass();
        obj.test();


        OuterClass.Demo d = obj.new Demo();
        d.display();
    }
}

