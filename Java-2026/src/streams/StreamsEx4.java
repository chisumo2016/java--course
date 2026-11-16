package streams;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 Static methods of the Stream class
     concat(Stream, Stream) - for concatenating two streams of (T... values) - values to stream.
     genarate(Supplier) - Infinite stream

     range(int, int) ir rangeClosed(int , int ) - range of values (only for Instream)
    */
public class StreamsEx4 {
    public static void main(String[] args) {

        Stream<String> s1 = Stream.of("a", "b", "c"); //Stream.o static
        Stream<String> s2 = Stream.of("d", "e", "f");

        //concat (combining two streams)
        Stream<String> s3 = Stream.concat(s1, s2);
        s3.forEach(System.out::println);


        Stream<String> stream1 = Stream.of("d ", "e", "f");
        Stream<String> stream2 = Stream.of("g ", "h", "i");

        Stream.concat(stream1, stream2)
                        .forEach(System.out::println);

        IntStream.range(10, 20) //10-19
                        .forEach(System.out::println);

        IntStream.rangeClosed(20, 30) //20-30
                        .forEach(System.out::println);

        Stream.generate(() ->  myGenerator() )
                .forEach(System.out::println);//inifite

    }

    static int myGenerator() {
        return  new Random().nextInt();
    }
}

