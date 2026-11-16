package variableScope;
/*
    Variable Scope : where a variable is accessible
    Types
    1. Local  : inside the method as the local scope
    2. Class

 */
public class Demo {

    public static void main(String[] args) {

        /*Local*/
        int x = 10;

        System.out.println(x);

        doSomething();
    }

    static void doSomething() {
        // local scope
        int x = 10;
    }
}
