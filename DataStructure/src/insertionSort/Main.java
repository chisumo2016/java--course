package insertionSort;
/*
   Insertion Sort: After comparing elements to the left
            shift elements to the right to make the room to insert a value

            Q: Quadratic time complexity : O(n^2)
               small data sets = decent
               large data sets = bad

            Less steps than Bubble Sort
            Best case is 0(n) compare to selection sort 0(n^2)
 */
public class Main {

    public static void main(String[] args) {

        int array[] = {9 , 1, 8 , 2, 7 , 3 , 6 , 5 , 4 };

        insertionSort(array);
             for (int i : array) {

                 System.out.print(i + "  ");
             }


    }

    private static void insertionSort(int[] array) {
          //loop
          for (int i = 1; i < array.length; i++) {
               int  temp = array[i];
               int j = i - 1;// keep track of the index of the element to the left of the current element
               while (j >= 0 && array[j] > temp) {
                   //shift elements to the right
                   array[j + 1] = array[j];
                   j--;
               }
               //insert the value int temp
               array[j + 1] = temp;
          }

    }
}
//        for (int i = 1; i < array.length; i++) {
//
//            System.out.println("i: " + i);
//
//            System.out.println("array: " + array);
//
//        }