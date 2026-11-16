package facedePattern;
/*
    Facade Pattern
      Provide a unified interface to a set of interfaces in a subsystem.
      Facade defines a higher-level interface that makes the subsystem easier to use.

      example
      Task - Talk to three  system ( S1 , S2 , S3 )

      C1   WILL TALK TO COMPLETE THE TASK       S1
      C2                                        S2
      C3                                        S3

      What if i introduce the chage eg s4 will be mess .

      Solution - Introduce Facade Pattern
      C1               fa                     S1 , S4

     FACEDE WILL RESPONSIBLE TO TALK ALL THREE SYSTEM
     ALL CLIENT WILL TALK TO FACADE (common method and u depend on facade)
      C2                                        S2
      C3                                        S3
      C4                                        S4

      f() -> (x,y,z)

      You modify one place and wont affect anything
 */

import java.security.Provider;

class  Service1{
    public void s1(){
        System.out.println("s1");
    }
}

class Service2{
    public void s2(){
        System.out.println("s2");
    }
}

class ServiceFacade{
    Service1 service1 = new Service1();
    Service2 service2 = new Service2();

    public void unifiedService(){
        service1.s1();
        service2.s2();
    }
}

public class FacadePatternDemo {

    public static void main(String[] args) {

        //client
        ServiceFacade facade = new ServiceFacade();
        facade.unifiedService();


    }
}
