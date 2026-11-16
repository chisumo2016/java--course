package initializers;
/*
    Initializer
        1) Static Initializer -     Runs once per the class    (class Level)
        1) Non Static Initializer - Runs once for each object  (Object Level)
 */


class Sample{

    /*Static Initializer */
    static {
        System.out.println("Static Initializer - class ");
    }

    /*Non-Static Initializer*/
    {
        System.out.println("Non-Static Initializer - object");
    }
}

public class InitializersEx1 {

    public static void main(String[] args) {
         Sample s1 , s2 , s3;

         s1 = new Sample();
         s2 = new Sample();
         s3 = new Sample();
    }
}
