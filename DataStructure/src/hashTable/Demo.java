package hashTable;
/*
   string
 */
import java.util.Hashtable;

public class Demo {

    public static void main(String[] args) {

        Hashtable<String, String> hashTable = new Hashtable<>(10); //capacity 11 (10, 0.5f);

        hashTable.put("100", "SpongeBob");
        hashTable.put("123", "Patric");
        hashTable.put("321", "Sandy");
        hashTable.put("555", "Squid ward");
        hashTable.put("777", "Gary");

        // hashTable.remove(123);

        for (String key : hashTable.keySet()) { //set is iterable

            //System.out.println(key.hashCode() +  "\t" +  key + "\t" + hashTable.get(key)); //index
            System.out.println(key.hashCode() %  10 +  "\t" +  key + "\t" + hashTable.get(key)); //index
        }
        //System.out.println(hashTable.get(100));
    }
}
