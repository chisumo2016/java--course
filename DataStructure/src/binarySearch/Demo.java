package binarySearch;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {

        int array[] = new int[1000000];
        int target = 777777;

        //loop

        for (int i = 0; i < array.length; i++) {
            //fill array i
            array[i] = i;
        }

        int index = binarySearch(array, target);

        if (index == -1){
            System.out.println(target + " not found");
        }else{
            System.out.println(target + " found at index " + index);
        }

    }

    private static  int binarySearch(int[] array, int target){

        int low = 0;
        int high = array.length - 1;

        while(low <= high){

            int middle = low + (high - low) / 2;
            int value = array[middle];

            System.out.println("middle: " + middle);

            if(value < target) low = middle + 1;
            else if(value > target) high = middle - 1;
            else return middle; //target id found

        }

        return -1;

    }
}
