package recursion;
/*
    Recursion : When a thing is defined in terms of itself . -Wikipedia
              Apply the result of procedure, to a procedure.
              A recursive function is a function that calls itself. Can be a substitue for iteration.
              Divide a problem into subproblems of the same type as the original problem.
              Commonly used with advanced sorting algorithms and navigating trees.

              Advantages
              - easier to read/write
              - easier to debug

              Disadvantages
              - sometimes slower
              - uses more memory

 */
public class Main {

    public static void main(String[] args) {

        walk(5);

    }

    private  static void walk(int steps){
        for (int i = 0; i < steps; i++){
            System.out.println("You take a step");
        }

    }
}
