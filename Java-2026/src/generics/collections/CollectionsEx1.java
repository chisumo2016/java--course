package generics.collections;

import java.util.HashSet;
import java.util.LinkedList;

/**
 *  Collections - Prebuilt Data Structures implementation (Java Library)

    I - Interfaces
    C - Class

    Collection - I
     Two subtype of collection
        1)List   - I
           ArrayList - C
           LinkedList -  C
        2)Set - I
            HashSet - C
            LinkedHashSet - C
            SortedSet - I
                TreeSet - C
    Map - I
        HashMap - C
        LinkedHashMap - C
        SortedMap - I
            TreeMap - C

    Shortcuts
       List - Allows duplicates
       Set - No duplicates
       Hash - Uses Hashing (insertion order not preserved)
       Linked - Uses Linked List (insertion order preserved)
       Tree - Sorted
       Map -Key-Value pairs
 */
public class CollectionsEx1 {

    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<Integer>();

        /*list allows duplicates value*/
        list1.add(10);
        list1.add(10);
        list1.add(20);

        System.out.println(list1);
        System.out.println();

        HashSet<Integer> set1 = new HashSet<>();

        /*set doesn't allows duplicates value*/
        set1.add(10);
        set1.add(10);
        set1.add(20);

        System.out.println(set1);
    }

}
