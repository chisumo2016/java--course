package introductionToInterfaces;
/*
   Default and static methods in Interfaces
 */

interface  ITest {
    void f();

    //void  g(); // someone came and introduce new interface method , this is violation

    default void g(){ // add an implementation, doesnt break the existing functionality
        System.out.println("h() in ITest");
    }

    static void h(){ // add an implementation, doesnt break the existing functionality
        System.out.println("h() in ITest");
    }
}


class  Test implements ITest {

    @Override
    public void f() {
        System.out.println("f() in Test");
    }
}

class  Test2 implements ITest {

    @Override
    public void f() {
        System.out.println("f() in Test2");
    }
}



public class InterfaceEx4 {
  static  void test(ITest i){
      i.f();

      //call to g
      i.g();

      ITest.h();
  }
    public  static  void main(String[] args) {
       test(new Test());

        System.out.println();

       test(new Test2());
    }
}
