package finalKeyword;
/*
   Final Keyword/ modifier
    1) Used for creating constants
        eg final double PI = 3.14;
    2) if a member is final, it can't overridden
    3) If a class if final it cannot be extended
 */

class Base{
    public  void print(){
        System.out.println("print in Base");
    }
}

class Derived extends Base{
    public void print(){
        System.out.println("print in Derived");
    }
}

public class InheritanceEx1 {

    public static void main(String[] args) {


    }
}
