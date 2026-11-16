package variableScope;

/*
    Class scope: Visible to all methods in the class
    Java prefer to use the local variable instead of class variable
 */
public class ClassVariable {

    static int x = 3;

    public static void main(String[] args) {

        int x = 1; //local
        System.out.println(x);

        doSomething();
    }

    static void doSomething() {
        // local scope
        int x = 2;


        System.out.println(x);
    }
}
