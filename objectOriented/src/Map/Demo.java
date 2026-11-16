package Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/*
 * Map in Java
 * 
 * Isn't an implementation , doesnt extend collection interface BUT 
 * It the part of collection  api
 * why do you MAP
 * Is the collection of Key and Value Pair
 * It Interface as well
 * key are unique and can't repeated but value can change
 * can we say  the key is the set and value are list to get a map ? 
 * Put method mean replace it
 * 
 * Hashtable works the same as Hashmap
 * So what is the difference btn Hashmap (is fjust for normal) and Hashtable (is for sychronized) ?
  
 */
public class Demo {

	public static void main(String[] args) {
		
		//1 HashMap
		Map<String, Integer> students = new HashMap<>();

        students.put("Navin", 56);
        students.put("Harsh", 23);
        students.put("Sushil", 67);
        students.put("Kiran", 92);
        students.put("Pranita", 100);
        students.put("Harsh", 45);
        
        
      //2 Hashtable
      		Map<String, Integer> students2 = new Hashtable<>();

              students.put("Navin", 56);
              students.put("Harsh", 23);
              students.put("Sushil", 67);
              students.put("Kiran", 92);
              students.put("Pranita", 100);
              students.put("Harsh", 45);
              
              

        //Printing the Map
        System.out.println(students);
        
        //Get the particular person
        System.out.println(students.get("Harsh"));
        
        
        //Print all the values by one by one
        System.out.println(students.keySet());
        
        for(String key : students.keySet())
        {
        	System.out.println(key + " : " +students.get(key) );
        }
        
        
		
		
				
	}

}
