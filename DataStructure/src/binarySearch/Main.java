package binarySearch;

import java.util.Arrays;

/*
   Binary Search :Search algorithm that finds the position of a target value within a sorted array.
   Half of the array is eliminated with each step.
        eg value = "H"
            index = ?

            H >

            1: Start in Middle
            "A" , "B" , "C" , "D" , "E" , "F" , "G" , "H" , "I" , "J" , "K" ,
              0    1     2     3     4     5     6     7     8     9     10


               "G" , "H" , "I" , "J" , "K" ,
                6     7     8     9     10

              H <

                "G" , "H"
                6     7

             H>
                 "H"
                  7

      Binary search isnt too efficiency on small data set, It good for large data set.

 */
public class Main {
    public static void main(String[] args) {

        int array[] = new int[100];
        int target = 42;

        //loop

        for (int i = 0; i < array.length; i++) {
            //fill array i
            array[i] = i;
        }

        int index = Arrays.binarySearch(array, target);

        if (index == -1){
            System.out.println(target + " not found");
        }else{
            System.out.println(target + " found at index " + index);
        }

    }
}
