package streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
   Terminal operations
      Terminate the pipeline of operations on the stream.
      Generates an explicit result or a side effect.

      findFirst() - find the first element that matched
      findAny() - finds any elements without focusing on the order of occurrence
      boolean anyMatch(Predicate<? super T> predicate) -
      boolean allMatch(Predicate<? super T> predicate) -
      boolean noneMatch(Predicate<? super T> predicate) -
      collect(Collector c) - performs a mutable reduction on the stream.
      toArray() - returns an array containing the elements of this stream
      forEach(Consumer c) - consume the elements of the stream .
 */
public class StreamsEx10 {
    public static void main(String[] args) {

        String arr[] = { "ab" , "a" , "xyz" , "bcd"};

        //find the first 3 digit strings (3 character string)
       Optional<String> str1 = Stream.of(arr)
                .filter(s -> s.length() == 3)
                .findFirst();  // the pipeline will be terminated here

       if (str1.isPresent())
           System.out.println("first 3 character strings :"  + str1.get());

        System.out.println();
       // Find if all strings are of length 3 character
       boolean all3CharStrings = Stream.of(arr)
                .allMatch(s -> s.length() == 3);

       System.out.println("All strings are of length 3: " + all3CharStrings);

        System.out.println();

        List<String> list = Stream.of(arr)
                .collect(Collectors.toList());

        System.out.println(list);



    }
}
