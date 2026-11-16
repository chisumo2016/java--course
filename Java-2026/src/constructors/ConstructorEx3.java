package constructors;
/*
      1) Object creation must match one of the constructors which is accessible.
      2) When you don't define a constructor for a class, the compiler provides one which is known as default constructor.
 */

class ComplexNumber{
    int real , img;

    public ComplexNumber(){
       real = 0;
       img = 0;
    }

    public ComplexNumber(int real ){
        this.real = real;
        this.img = 0;
    }

    public ComplexNumber(int real , int img){
        this.real = real;
        this.img = img;
    }



    public void print(){

        System.out.printf(" (%d)+i(%d) \n",real,img);
    }
}
public class ConstructorEx3 {

    public static void main(String[] args){

        ComplexNumber c1 = new ComplexNumber();
        ComplexNumber c2 = new ComplexNumber(100);
        ComplexNumber c3 = new ComplexNumber(100,200);

        c1.print();
        c2.print();
        c3.print();
    }
}
