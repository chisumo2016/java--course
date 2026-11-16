package dataHinding;
/*
  Data Hiding : Hidden framework
     private member
     public member
     protected member

     class { data  + operations } + data hiding + encapsulation
 */

class PositiveInteger{
    //data /state
    private  int x;

    //operations / behaviour
   public void set(int value){
        if(value >= 0){
            x = value;
        }
    }

    public int get(){
        return x;
    }
}

public class Hiding {

    public static void main(String[] args){
        //reference variable
        PositiveInteger n1;

        //create object and assign it to reference variable n1
        n1 = new PositiveInteger();
        n1.set(10);
        //n1.x= -10; // avoid this
        System.out.println(n1.get());
        n1.set(-10);
        System.out.println(n1.get());
    }
}
