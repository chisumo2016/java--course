package constructors;

class  PositiveInteger{

    private int x ;

    public PositiveInteger(){
         x = 0;
    }

    public PositiveInteger(int value){
        x = value;
    }

    public  void setX(int value){
        if (value >= 0){
            this.x = value;
        }

    }
    public int getX(){

        return this.x;
    }
}

public class ConstructorEx2 {

    public static void main(String[] args){
        PositiveInteger pi = new PositiveInteger();
        System.out.println(pi.getX());

        PositiveInteger pi2 = new PositiveInteger(10000);
        System.out.println(pi2.getX());
    }
}
