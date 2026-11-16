package IntroductionClasses;
/*
   Classes: design own types
     class { data + operations }

     sample1(reference type/pointer)) ---------> x[100] object
     sample2(reference type/pointer))  ---------> x[200] object

     will have its own copy
 */

// Template
class Sample{
   //data
    int x;

    //operations
    void set(int value){
        x = value;
    }

    int getX(){
        return x;
    }

}
public class Class {

    public static void main(String[] args) {
        Sample sample1 = new Sample();
        Sample sample2 = new Sample();
        sample1.set(100);
        System.out.println(sample1.getX());
        sample2.set(200);
        System.out.println(sample2.getX());

    }
}
