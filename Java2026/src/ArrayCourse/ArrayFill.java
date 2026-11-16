package ArrayCourse;

import java.util.Arrays;

public class ArrayFill {

    public static void main(String[] args) {

        String[] fruits = {"apple", "orange" , "banana","coconut"};

        /*Fill array**/
        Arrays.fill(fruits ,"pineapple");

        for (String  f : fruits){

            System.out.println(f + "  ");
        }

    }
}
