package streams;

import java.util.Arrays;

/*
    Intermediate and Mapping
      distinct() - returns a stream with no duplicates
      filter(Predicate) - returns a stream with elements which only those elements for which the predicate returns true.
                         - filter the values which we're interested in .
      map(Function) - returns a stream where the given function is applied on each element of the input stream .
      mapToInt() , mapToDouble() , mapToLong() - Produces the stream of primitive values and not objects
 */
public class StreamsEx5 {

    public  static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};

        //distinct
        System.out.println("Distinct Values");
        Arrays.stream(arr)
                .distinct().
                forEach(System.out::println); //print distinct values

        System.out.println();
        System.out.println("Distinct values where are  > 2");
        Arrays.stream(arr)
                .distinct()
                .filter(i -> i > 2)
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Find Distinct values where are and their squares > 2 via PIPELINE");
        Arrays.stream(arr)
                .distinct()
                .filter(i -> i > 2)
                .map(i -> i*i) //transformation
                .forEach(System.out::println);

    }
}
