package generics.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CollectionsEx4 {

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
        //System.out.println(set3); // set3.toString()

        /*Access the individual elements of the collections can be used of HashSet LinkedHashSet */
        System.out.println("Values ins the collection are :");
        for(Integer value : set3){
          System.out.println(value);
        }
    }
}
