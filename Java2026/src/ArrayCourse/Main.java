package ArrayCourse;

import java.util.Arrays;

/**
 * Arrays : A collection of values of the same data type.( Rererence type)
 *         * Think of it as a variable that can hold/store multiple values.
 */
public class Main {

    public static void main(String[] args) {

        String[] fruits = {"apple", "orange" , "banana","coconut"};

        /*Change the element of index**/
        fruits[0] = "grape";

        /*length of array**/
        int numOfFruit = fruits.length;

        /*print all array**/

        for (int i= 0 ; i<fruits.length; i++){
            System.out.print(fruits[0]);
            System.out.print(fruits[i] + "  ");
        }

        /*Enhanced for loop circle once each of an array   for (DataType  uniqueIdentifier  : arrays){**/
        for (String  f : fruits){
            System.out.println(f + "  ");
        }

        /*Sort array**/
        Arrays.sort(fruits);

        System.out.println(fruits[0]);
        System.out.println(numOfFruit);
    }
}
