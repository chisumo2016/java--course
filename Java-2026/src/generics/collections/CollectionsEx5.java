package generics.collections;

import java.util.*;

    /*
         Iterator
         Iterator is used to iterate over the collection
         Collection is the parent interface of all collection classes it applies to all collection classes (values)

         private  static  void display(Collection<Integer> col){

                for(Integer value : col){

                         System.out.println(value);
                     }

         }

         You dont specify the type of collection is called Objetc
         private  static  void display(Collection col){}

       1:   private  static  void display(Collection<Integer> col){
         //For each value in the collection
         for(Integer value : col){

             System.out.println(value);
            }
        }

       2:  private  static  void display(Collection<Integer> col){ // LinkedList<Integer> list this will not work for all list types

     Iterator<Integer> iterator = col.iterator();

     while(iterator.hasNext()){
         Integer value = iterator.next();
         System.out.println(value);
     }
 }
     */
public class CollectionsEx5 {
 private  static  void display(Collection<Integer> col){ // LinkedList<Integer> list this will not work for all list types

     Iterator<Integer> iterator = col.iterator();

     while(iterator.hasNext()){
         Integer value = iterator.next();
         System.out.println(value);
     }
 }
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(10);
        list.add(20);
        list.add(10);

        System.out.println("values in the list are ........");
        display(list);

        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(10); // HashSet does not allow duplicate values
        set.add(20);// HashSet does not allow duplicate values
        set.add(10); // HashSet does not allow duplicate values

        System.out.println("values in the set are ........");
        display(set);
    }
}
