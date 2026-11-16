package methodOverloading;
/*
 * Method Overloading
               Providing multiple definitions/ to the same identifier/methods.
 */

class Sample{

    //definitions
    public void print(int a ){
        System.out.println("integer - "+ a);
    }

    public void print(float a){
        System.out.println("float - "+ a);
    }

    public  void print(String a ){
        System.out.println("String - "+ a);
    }
}
public class OverloadingEx1 {

    public static void main(String[] args) {

        Sample obj = new Sample();
        obj.print(10);
        obj.print(10.5f);
        obj.print("Hello");
    }
}
