package recursion;

public class Demo {

    public static void main(String[] args) {

        walk(5); //100000
    }

    private  static void walk(int steps){
        //recursion
        if (steps < 1) return; //base case
        System.out.println("You take a step");
        walk(steps - 1); //recursive case
    }
}
