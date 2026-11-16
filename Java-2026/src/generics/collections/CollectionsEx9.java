package generics.collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.TreeSet;

/*
   Customs classes with collections
      If working with hash structures, we need to implement hashcode and equals methods
      If working with tree structures, we need to implement comparable interface or we need to provide Comparator

      eg uses in class
 */

public class CollectionsEx9 {

    public static void main(String[] args) {
        TreeSet<SomeFruit> set = new TreeSet<>();

        set.add(new SomeFruit("apple"));
        set.add(new SomeFruit("Banana"));
        set.add(new SomeFruit("apple")); // should not add duplicate
        set.add(new SomeFruit("APPLE"));

        System.out.println(set);

    }
}

class SomeFruit implements Comparable<SomeFruit>{

    private String name;

    public SomeFruit(String name){
        this.name = name;
    }

    public String toString(){
        return this.name;
    }

    //f1.equal(f2)
    @Override
    public boolean equals(Object o) { // o other object
        if (! (o instanceof SomeFruit) || o == null)
            return  false;

        return  this.name.equals(((SomeFruit)o).name);

//        if (o == null || getClass() != o.getClass()) return false;
//        Fruit fruit = (Fruit) o;
//        return Objects.equals(name, fruit.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name); //depend on name field
    }

    //f1.comperaTo(f2)
    @Override
    public int compareTo(SomeFruit o) {
        return this.name.compareToIgnoreCase(o.name); // this.name current name
        //return this.name.compareTo(o.name); // this.name current name
    }
}

