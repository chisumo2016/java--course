package generics.collections;

import java.util.HashMap;

/**
     Map - I
         HashMap - C
         LinkedHashMap - C
         SortedMap - I
            TreeMap - C

    Map - thing like a dictionary
       Key , Value pairs
        (k1 , v1)
        (k2 , v2)
 */
public class CollectionsEx6 {
    public static void main(String[] args) {

        HashMap<String , Integer>  fruitMap  = new HashMap<>();
        /*store -> put(key ,value) */
        fruitMap.put("apple" , 20);
        fruitMap.put("mango" , 30);
        fruitMap.put("banana" , 30);

        /*return the value = get(key) */
        int applePrice = fruitMap.get("apple");

        System.out.println(applePrice);

        /*Print the value of the Mapy*/
        System.out.println("content of the fruitMap");
        for(String key : fruitMap.keySet()){
            int value = fruitMap.get(key);

            System.out.println(key + " : " + value);
        }
    }


}
