package constructors;


class ComplexNumber4{
    int real , img;

//    private ComplexNumber4(){
//        real = 0;
//        img = 0;
//    }

    public ComplexNumber4(int real ){
        this.real = real;
        this.img = 0;
    }

    public ComplexNumber4(int real , int img){
        this.real = real;
        this.img = img;
    }



    public void print(){

        System.out.printf(" (%d)+i(%d) \n",real,img);
    }
}
public class ConstructorEx4 {

    public static void main(String[] args){

        //ComplexNumber4 c1 = new ComplexNumber4();
        ComplexNumber4 c2 = new ComplexNumber4(100);
        ComplexNumber4 c3 = new ComplexNumber4(100,200);

        //c1.print();
        c2.print();
        c3.print();
    }

}
