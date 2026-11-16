package arrays;

import java.util.Scanner;

/**
 * Passing an array to a function
 */
public class Demo3 {

    /**
      * return index if found, otherwise return -1
      * @param arr
      * @param searchElement
      * @return
      *
     */

    // Option 1
    static int search(int arr[] , int searchElement){

        boolean found = false;
        int i; //i is complete block

        for (i = 0 ; i < arr.length ; i++){
            if (arr[i] == searchElement){
                found = true;
                break;
            }
        }
        //scope of i isn't visible

        if (found)
            return i;
        else
            return -1;
    }

    // Option 2
    static  int searchElement(int arr[] , int searchElement){

        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] == searchElement){
                return i; //take out from function with some value
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {10, 20 , 30 , 40 , 10 , 20 };

        int searchElement;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the element to search : ");
        searchElement = scanner.nextInt();

        //call
        int index = searchElement(arr, searchElement);

        if (index != -1)
            System.out.println("Element found at index : " + index);
        else
            System.out.println("Element not found");
    }
}
