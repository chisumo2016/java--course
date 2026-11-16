package generics.collections;

import java.util.HashSet;
import java.util.Objects;

/*
   Customs classes with collections
      If working with hash structures, we need to implement hashcode and equals methods
      If working with tree structures, we need to implement comparable interface or we need to provide Comparator

      eg uses in class
 */
public class CollectionsEx8 {

    public static void main(String[] args) {
        HashSet<Fruit> set = new HashSet<>();

        set.add(new Fruit("Apple"));
        set.add(new Fruit("Banana"));
        set.add(new Fruit("Apple")); // should not add duplicate

        System.out.println(set);

    }
}

class Fruit{

    private String name;

    public Fruit(String name){
        this.name = name;
    }

    public String toString(){
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (! (o instanceof Fruit) || o == null)
            return  false;

        return  this.name.equals(((Fruit)o).name);

//        if (o == null || getClass() != o.getClass()) return false;
//        Fruit fruit = (Fruit) o;
//        return Objects.equals(name, fruit.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name); //depend on name field
    }
}
