package generics.collections;

/*
    Problem here to remove the duplicates
    Soln is use HashSet

    [20, 40, 10, 30] why order isnt maintained?
 */

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CollectionsEx2 {
    public static void main(String[] args) {
        int a[] = { 10 , 20 , 30 , 40 , 10 , 20 , 10 };
        int a1[] = { 30 , 10 , 20 , 40 , 10 , 20 , 10 }; //TO WITH ORDER

        HashSet<Integer> set1 = new HashSet<>();
        for (int element : a) {
           if (!set1.add(element)) { //.contains
               System.out.println("duplicate found - " + element);
           }
        }
        System.out.println(set1);

        System.out.println();

        // getting element in insertion order and order is preserved
        LinkedHashSet<Integer> set2 = new LinkedHashSet<Integer>();
        for (int element : a1) {
            if (!set2.add(element)) { //.contains
                System.out.println("duplicate found - " + element);
            }
        }
        System.out.println(set2);

        // Sort elemnt by default
        TreeSet<Integer> set3 = new TreeSet<Integer>();
        for (int element : a1) {
            if (!set3.add(element)) { //.contains
                System.out.println("duplicate found - " + element);
            }
        }
        System.out.println(set3); // set3.toString()
    }
}
