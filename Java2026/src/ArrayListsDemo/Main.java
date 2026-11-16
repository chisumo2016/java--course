package ArrayListsDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
      AllayList : A resizable array that can store objects (autoboxing).
                  Array are fixed in size , but ArrayLists are dynamic in size /changeable.

                  ArrayList<type of object to store> list = new ArrayList<>();
                  ArrayList<Integer> list = new ArrayList<>();
                  ArrayList<Double> list = new ArrayList<>();
                  ArrayList<String> list = new ArrayList<>();
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Double> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();

        list1.add(4);
        list1.add(4);
        list1.add(4);

        //Print arrayList
        System.out.println(list1);
        System.out.println();

        list2.add(4.99);
        list2.add(4.00);
        list2.add(4.999);

        System.out.println(list2);
        System.out.println();

        list3.add("Banana");
        list3.add("Tango");
        list3.add("Apple");

        // Remove element from array
        list3.remove(2);

        // replace an element from array
        list3.set(1, "machungwa");

        System.out.println(list3);
        System.out.println();

        //Get an element fron certain index
        System.out.println(list3.get(1));

        //Get size of array list
        System.out.println(list3.size());

        //sort the  array list from array
        Collections.sort(list3);
        System.out.println(list3);

        for (String element : list3) {
            System.out.println(element);
        }

    }
}
