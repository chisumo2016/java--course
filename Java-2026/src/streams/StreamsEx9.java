package streams;

import java.util.Arrays;
import java.util.Optional;

/*
   Intermediate operations
     Observing the elements of a stream
       - peek (Consumer)
           - Returns the output stream that is identical to the input stream.
           - Useful for debugging purposes(stream).
           - Each element is passed to the accept() method of the consumer.
 */
public class StreamsEx9 {

    public static void main(String[] args) {
        String[] arr = {"ab", "abcdef", "xy", "bcd", "abcd"};

        //Find the length of max length string in an array
        Optional<Integer> max = Arrays.stream(arr)
                .peek(x -> System.out.println(x)) //
                .map(x -> x.length()) //String::length
                .peek(System.out::println)
                .max((x,y) -> x-y);

        if (max.isPresent())
            System.out.println("max value - " + max.get());

    }
}
