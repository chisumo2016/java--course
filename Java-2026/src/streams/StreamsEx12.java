package streams;

import java.util.Arrays;

/*
   Folding Streams
     reduce(BinaryOperator<T> accumulator)
     reduce(Identity, BinaryOperator<T> accumulator)
         - Takes a stream and reduces it to a single value
         - How the reduction works id defined by the accumulator
         - reduce() method mantains a partial state
 */
public class StreamsEx12 {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50};

        //sum of the value of the array
        int sum = Arrays.stream(arr)
                .reduce(0, (x, y) -> x+y);
        System.out.println();
        int sum1 = Arrays.stream(arr)
                .reduce(0, (oldSum, y) -> {
                    System.out.println("oldSum is " + oldSum + " y is " + y);
                    return oldSum +y;
                });

        System.out.println();
        int product = Arrays.stream(arr)
                .reduce(1, (p, y) -> {
                    System.out.println("product (p) " + p + " y is " +  y);
                    return p * y;
                });

        System.out.println("Sum: " + sum);

        System.out.println("Sum: " + sum1);

        System.out.println("Sum: " + product);
    }
}
