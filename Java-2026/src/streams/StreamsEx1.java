package streams;
/*
    Streams (flow of data
       Enable to define a pipeline of operations to process collection of elements / data .
       Consists of three main components:
           1. Source - producing the data
           2. Zero of more Intermediate Operations - transforming/ filtering the data)
           3. Terminal Operations - produce the result
      Pipeline is not evaluated till the terminal operation is INVOKED

      Example
           To find out the Sum of the squares of all the even numbers of an array
           int arr[] = {1,2,3,4,5,6};
           int sum = Arrays.stream(arr) //source
                           .filter(n -> n % 2 == 0) // Intermediate Operations
                           .map(n -> n * n) Intermediate Operations
                           .sum(); //Terminal Operations

 */
public class StreamsEx1 {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6};

        //1: Imperative programing (Traditional Approach)
        int sum = 0;

        for(int value = 0; value < arr.length; value++) {  //source
            if(arr[value] % 2 == 0) { //filter
                sum += value * value; // map
                //sum += arr[value] * arr[value];
            }
        }

        //2: Imperative programing
        for (int value : arr) {
            if(value % 2 == 0) {
                sum += value * value;
            }
        }
        System.out.println("Sum of squares of even numbers : " + sum);
    }
}
