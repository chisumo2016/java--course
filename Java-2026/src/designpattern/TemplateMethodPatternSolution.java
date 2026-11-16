package designpattern;

import java.util.Scanner;

class SearchAlgorithmSolution{

    //Algorithm
    public  int search(int[] arr, int searchElement){
        for (int i = 0; i < arr.length; i++){
            if (match(arr[i] ,searchElement)){ //equality
                return i;
            }
        }
        return -1;
    }

    //Subclass wil define from here
    public boolean match(int value, int searchElement){
        return value == searchElement;
    }

}

class InequalitySearchAlgorithmSolution extends SearchAlgorithmSolution{
    @Override
    public boolean match(int value, int searchElement){
        return value != searchElement;
    }
}

public class TemplateMethodPatternSolution {

    public static void main(String[] args) {
        SearchAlgorithmSolution searchAlgorithmSolution = new SearchAlgorithmSolution();

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
