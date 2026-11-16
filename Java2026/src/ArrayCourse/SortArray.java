package ArrayCourse;

import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {

        String[] fruits = {"apple", "orange" , "banana","coconut"};

        /*Sort array**/
        Arrays.sort(fruits);

        for (String  f : fruits){

            System.out.println(f + "  ");
        }

    }
}
