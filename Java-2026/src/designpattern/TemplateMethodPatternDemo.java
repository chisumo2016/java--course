package designpattern;

import java.util.Scanner;

/*/
   Template Method Pattern

    An abstract super class defines the skeleton of the algorithm, leaving certain customizable portions of the algorithm to its subclasses.
    The template method defines the skeleton of an algorithm

    NOTE :
    class should be Open from extension but closed for modification


 */
//This is the violation of open close principle
class SearchAlgorithm{

    public  int search(int[] arr, int searchElement){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == searchElement){ //equality
                return i;
            }
        }
        return -1;
    }

    public  int searchInequality(int[] arr, int searchElement){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] !=searchElement){ //equality
                return i;
            }
        }
        return -1;
    }
}
public class TemplateMethodPatternDemo {

    public static void main(String[] args) {
        SearchAlgorithm searchAlgorithm = new SearchAlgorithm();

        int[] arr = {10, 20, 30, 40, 50};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        int searchElement = scanner.nextInt();
        int result = searchAlgorithm.search(arr, searchElement);

        if (result != -1){
            System.out.println("Element found at index: " + result);
        }
        System.out.println("Element not found at index: " );
    }
}
