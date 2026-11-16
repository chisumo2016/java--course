package generics;

import java.util.ArrayList;

/*
    Generics: A concept where you can write a class, interface, or method that is compatible with different data types.

    <T> Type parameter (Placeholder that gets replaced with a real data type)
    <String> type argument (specifies the type) eg Integer, String, Double, boolean

     ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");

        System.out.println(fruits);
  */

public class Main {

    public static  void main(String[] args) {

       //Box<String> box = new Box<>();
       Box<Integer> box = new Box<>();
       Box<Double> box1 = new Box<>();

       box.setItem(3);
       box1.setItem(3.12);
       System.out.println(box.getItem());

       ArrayList<String> fruits = new ArrayList<>();


    }
}
