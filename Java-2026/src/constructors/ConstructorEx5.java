package constructors;
/*
   Other constructor invocation using this.
   Note :
       this(...) call should be the first statement in the constructor.
 */

class  Demo{
    Demo(){

        // arg constructor call, should be the first statement
        this(100);
        System.out.println("reset of the code....");
        //System.out.println("Some complicated init ..... with 0");
    }

    Demo(int a){

        System.out.println("Some complicated init ....." + a);
    }
}
public class ConstructorEx5 {

    public static void main(String[] args){

        Demo di = new Demo();

        System.out.println();

        Demo di2 = new Demo(200);

    }
}
