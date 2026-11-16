package designpattern;
/*
   1st Template Method Pattern
 */
import java.util.Scanner;

//abstract supper class
abstract class SearchAlgorithmSolutionB{

    //Template method
    public  int search(int[] arr, int searchElement){
        for (int i = 0; i < arr.length; i++){
            if (match(arr[i] ,searchElement)){ //equality
                return i;
            }
        }
        return -1;
    }

    //Abstract method
    public abstract boolean match(int value, int searchElement);

}

class EqualitySearchAlgorithmSolutionB extends SearchAlgorithmSolutionB{
    @Override
    public boolean match(int value, int searchElement){
        return value == searchElement;
    }
}

class InequalitySearchAlgorithmSolutionB extends SearchAlgorithmSolutionB{
    @Override
    public boolean match(int value, int searchElement){
        return value != searchElement;
    }
}
public class TemplateMethodPatternSolutionB {

    public static void main(String[] args) {
        EqualitySearchAlgorithmSolutionB searchAlgorithmSolution= new EqualitySearchAlgorithmSolutionB();

        int[] arr = {10, 20, 30, 40, 50};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        int searchElement = scanner.nextInt();
        int result = searchAlgorithmSolution.search(arr, searchElement);

        if (result != -1){
            System.out.println("Element found at index: " + result);
        }
        System.out.println("Element not found at index: " );
    }
}
