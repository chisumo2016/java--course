package lambda;

/*
    Functional Interface : single method , @FunctionalInterface - cannt had add method,
    Lambda - method references  System.out:: - expression  , println - method
    Lambda -- to implement single method
 */
@FunctionalInterface
interface  Greet{
    void sayHello(String name);
}


public class LambdaEx2 {

    public static void main(String[] args) {
        //1: Anonymous Approach

        Greet greet = new Greet() {
            @Override
            public void sayHello(String name) {
                System.out.println("Hello " + name);
            }
        };

        greet.sayHello("John");
        System.out.println();

        //2: Lambda  Approach  ->defination

        Greet greet2 = (name) -> System.out.println("Hello " + name + "from Lambda");
        greet2.sayHello("Doe");

        //2: Lamba - method references  System.out:: - expression  , println - method

        Greet greet3 = System.out::println;

        greet3.sayHello("method references");


    }
}
