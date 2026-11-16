package streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
   Intermediate operations
    Restricting the size of the stream
      skip(long n)  - skips the first n elements of the stream .

      limit(long n) - returns the stream that contains only the first n elements of the stream.
 */
public class StreamsEx7 {

    public static void main(String[] args) {

        String arr[] = {"this", "is", "sample", "string" , "with" ,"simple" , "text"};

        //Combine in single word
        String str = Stream.of(arr)
                .skip(2)
                .limit(3)
                .collect(Collectors.joining(" ")); // Collectors.joining - combine multiple values into a single string

        System.out.println(str);
    }
}
