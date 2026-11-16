package arrays;

import java.util.Scanner;

/*
    Arrays - An array ia a collection of homogeneous elements
    Index starts with 0 .
    Length property allows you to find the length of the array.
    Allocation using new keyword.
       int arr[] = new int[5];
    Initialized using two ways
       1) int arr[] = { 10, 20, 30 }
       2) int arr[];
              arr = new int[]{ 10, 20, 30 };


            reference variable(pointer hold the address) arr[1000]--------->    [ ][ ][ ][ ][ ]  memory
                                                                                 0  1  2  3  4
                                                                                  new int[5]
            access an array arr[3]

   Accessing arrays beyond its boundaries leads to ArrayIndexOutOfBoundsException
 */
public class Main {

    public static void main(String[] args) {

        int arr[] = new int[5];

        //read the value
        Scanner scanner = new Scanner(System.in);

        int i ;

        //read the value
        for (i = 0; i < arr.length; i++)
        {
            System.out.println("Enter the value " +  i  + " " +"elements");
            arr[i] = scanner.nextInt();
        }

        //Print out
        System.out.println("Values in the array are ");
        for (i = 0; i < arr.length; i++)
            {
                System.out.println(arr[i]);
            }


        System.out.println("Values in the array are ");
          for (int element : arr){
              System.out.println(element);
          }

    }
}
