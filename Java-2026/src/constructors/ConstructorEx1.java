package constructors;

/**
        Constructors - A function like block which takes  the name of the class but with no return type .

       invoked when object is created
        Overloaded constructors
 */

class Sample{

    //no argument constructor
    public Sample(){
        System.out.println("no argument constructor");
    }

    //argument constructor overloading
    public Sample(int value){
        System.out.println("argument constructor with value " + value);
    }

}
public class ConstructorEx1 {

    public static void main(String[] args) {

        Sample sa = new Sample();
        Sample s2 = new Sample(100);
    }
}
