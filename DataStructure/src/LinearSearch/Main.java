package LinearSearch;
/*
    Linear Search: Iterate through a collection one element at a time

        runtime complexity: O(n)
        Disadavantages
        - Slow for larage data sets
        - Not efficient
        - Not scalable

        Advantages
          Fast for searches of small to medium data sets
          Does not require the data to be sorted
          Useful fir data structure that do not have random access (Linked List)
   */
public class Main {

   public static void main(String[] args) {

        int[] arr = {9 , 1, 8 ,2 , 7 ,3 , 6, 4, 5}; //small data set
        
        int index = linearSearch(arr, 1);

        if (index != -1) {
            System.out.println("Value/Element found at index: " + index);
        } else {
            System.out.println("Value/Element  not found");
        }
   }

    private static int linearSearch(int[] arr, int value) { // value is the value we are searching for
       //loop through the array
       for(int i = 0; i < arr.length; i++) {
           if(arr[i] == value) {
               return i;
           }
       }
       return -1; //central value
    }
}
