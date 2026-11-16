package hashTable;
/*
    HashTable : A data structure that stores keys to values ex.<Integer, String>
                Each key/value pair is known as an Entry
                FAST instertion , look up, deletion of key/value pairs
                Not ideal for small data sets, great with large data sets .

   Hashing : takes a key and computes an integer (formula will vary based on key and data type)
            In a Hashtable, we use the hash % capacity to calculate an index number

            key.hashCode() % capacity = index

    Bucket : an ndexed storage loacation for one or more Entries
             can store multiple Entries in case of a collision (linked similarly a LinkedList)

   Collision : hash function generates the same index for more than one key
               less collision = more efficiency

   Runtime complexity : O(1) Best case,
                        O(n) worst case
 */
import java.util.Hashtable;

public class Main {

    public static void main(String[] args) {

        Hashtable<Integer, String> hashTable = new Hashtable<>(10); //capacity 11 (10, 0.5f);

        hashTable.put(100, "SpongeBob");
        hashTable.put(123, "Patric");
        hashTable.put(321, "Sandy");
        hashTable.put(555, "Squid ward");
        hashTable.put(777, "Gary");

       // hashTable.remove(123);

        for (Integer key : hashTable.keySet()) { //set is iterable

            System.out.println(key.hashCode() % 10 + "\t" +  key + "\t" + hashTable.get(key)); //index
            //System.out.println(key.hashCode() + "\t" +  key + "\t" + hashTable.get(key));
            //System.out.println(key + ": " + hashTable.get(key));
        }
        //System.out.println(hashTable.get(100));
    }
}
