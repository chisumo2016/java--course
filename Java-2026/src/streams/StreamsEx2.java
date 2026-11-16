package streams;

import java.util.Arrays;

public class StreamsEx2 {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};

        //Functional code using streams
       int sum =  Arrays.stream(arr)  //source
               //.parallel() //sequel
               //pipilie
            .filter(x -> x % 2 == 0) //intermediate operation , predicate
            .map(x -> x * x) //intermediate operation , function
            .sum(); //forEach(System.out::println);//map

        System.out.println("sum = " + sum);
    }
}

