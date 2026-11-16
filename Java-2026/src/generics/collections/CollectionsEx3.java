package generics.collections;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

//toString() of the Object class
public class CollectionsEx3 {
    public static void main(String[] args) {
        Sample s = new Sample();
        System.out.println(s);
        //System.out.println(s.toString());
    }
}

class Sample{
  @Override
  public String toString(){
    return "Sample";
  }
}
