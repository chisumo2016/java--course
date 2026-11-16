package streams;

import java.util.Arrays;
import java.util.stream.Stream;

/*
    Intermediate and Mapping
      Maps and FlatMaps

      map() - 1 to 1 mapping
        [[1] , [2,3,4], [5,6] ,[7,8,9]]
      flatMap() - 1 to many mapping
      [1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9]
 */
public class StreamsEx6 {
    public static void main(String[] args) {

        String arr[] = { "this" , "this is" , "this is a sentence"};

        //Print individual words
        System.out.println("Using  FlatMap");
        Arrays.stream(arr)
                .map(s -> s.split(" "))  // an array of individual words
                .forEach(s -> System.out.println(Arrays.toString(s)));

        System.out.println();
        System.out.println("Using  Map");
        Arrays.stream(arr)
                .flatMap(s-> Stream.of(s.split(" ")))  // full sentence not array / stream value
                .forEach(s -> System.out.println(s));
    }
}
