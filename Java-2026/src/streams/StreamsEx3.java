package streams;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
   Stream Sources
        Collection -
            Stream()
                - sequential stream of elements in a collection

        Arrays -
            stream()
                - sequential stream of elements in an array

        Files class
            lines()
                - A stream of lines from the given file
   Static methods of the Stream class
       concat(Stream, Stream) - for concatenating two streams of (T... values) - values to stream.
       genarate(Supplier) - Infinite stream

       range(int, int) ir rangeClosed(int , int ) - range of values (only for Instream)
 */
public class StreamsEx3 {

    public static void main(String[] args) throws Exception{
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("ab");
        list.add("c");

        //collection
        list.stream()
                .forEach(System.out::println); //.forEach(x -> System.out.println(x));

        System.out.println("contents of the file java.txt");

        //Files- read
        Files.lines(Path.of("/Users/developer/Documents/java/Java-2026/java.txt"))
                .forEach(System.out::println);
    }
}
