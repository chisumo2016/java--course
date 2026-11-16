package streams;

import java.util.Arrays;

/*
   Intermediate operations

    Sorting Streams
       - sorted(Comparator) - returns a stream with elements sorted based on comparator
       - sorted(Comparator<? super T> comparator) - returns a stream with elements sorted based on comparator
       - sorted() return stream sorted using natural ordering
 */
public class StreamsEx8 {
    public static void main(String[] args) {

        String arr[] = {"ab", "a", "xy", "bc"};

        System.out.println("Sorting using natural ordering");
        Arrays.stream(arr)
                .sorted()
                .forEach(System.out::println);


        System.out.println();
        System.out.println("Sorting using comparator order");
        Arrays.stream(arr)
                .sorted((x, y) -> -1 * x.compareTo(y))  //descending order of -1
                .forEach(System.out::println);

    }

}
