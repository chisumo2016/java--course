package searchArray;

/***
 * search an array
 */
public class Main {

    public static void main(String[] args) {

        int[] numbers = {1, 9, 2, 8, 3 , 5 , 4};
        int target = 7;
        boolean isFound = false;

        //lineae search
        for (int i = 0; i < numbers.length; i++) {
            if (target == numbers[i]) {
                System.out.println("Element found at index " + i);
                isFound = true;
                break;
            }
        }
         if (!isFound) {
             System.out.println("Element not found is the array");
        }
    }
}
