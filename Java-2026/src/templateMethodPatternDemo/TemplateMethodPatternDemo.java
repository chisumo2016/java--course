package templateMethodPatternDemo;
/*
  High Level Design :
  Template Method Pattern :
      An Abstract supper class defines the skeleton of the algorithm leaving certain customizable portions  of the algorithm to its subclasses to defines

      note : There's another way of solving this problem using Strategy Pattern
  */

import java.util.Scanner;

abstract  class SearchAlgorithm{

    // Algorithm / Template Method Pattern :
    public int search(int[] arr, int  searchElement) { //target
        for (int i = 0; i < arr.length; i++) {
            if (match(arr[i], searchElement)) {  // this isnt customizable  arr[i] == searchElement
                return i;
            }
        }
        return -1;
    }

    public abstract  boolean match(int value, int searchElement) ;
}

class EqualitySearchAlgorithm extends SearchAlgorithm {
    @Override
    public boolean match(int value, int searchElement) {
        return value == searchElement;
    }
}

class InequalitySearchAlgorithm extends SearchAlgorithm {
    @Override
    public boolean match(int value, int searchElement) {
        return value != searchElement;
    }
}

public class TemplateMethodPatternDemo {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        int searchElement = scanner.nextInt();

        SearchAlgorithm searchAlgorithm = new EqualitySearchAlgorithm();

        int index = searchAlgorithm.search(arr, searchElement);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }

    }
}
