package hashmaps;

import java.util.HashMap;

/*
   Hashmaps 🗺️ A data structure that stores key-value pairs.
             Keys are unique , but values can be duplicated.
             Doesnt maintain order any order , but  is memory efficient.

             HashMap< Key, Value >
             HashMaps is class that stores key-value pairs.
 */
public class Main {

    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<>();

        map.put("apple", 1.0);
        map.put("orange", 2.0);
        map.put("banana", 3.0);
        map.put("coconut", 4.0);

        //must be uniques , doesnt have duplicates key
        //map.put("orange", 10000.000);

        //remove
        //map.remove("apple");

        //get a value associate with the key
        System.out.println(map.get("orange"));

        // check if the key exists
        System.out.println(map.containsKey("orange"));
        System.out.println(map.containsKey("apple"));

        // we can use if
        if (map.containsKey("apple")){
            System.out.println(map.get("applew"));
        }
        else {
            System.out.println("Key not found");
        }

        //contains value
        if (map.containsValue(2.0)){
            System.out.println("Value found");
        }
        else {
            System.out.println("Value not found");
        }

        //size
        System.out.println(map.size());

        //cycle key pair
        for (String key : map.keySet()){ //get from map key set
            System.out.println(key + " : $" + map.get(key));
        }

        System.out.println(map);

    }
}
