package SelectionSort;
/*
  selection sort : search through an array and keep track of the minimum value during each iteration.
  At the end of each iteration , we swap the minimum value with the first element of the unsorted part of the array.
  or swap variables

      Quadratic time complexity : O(n^2)
      Small data set = okay
      Large data set = bad
 */
public class Main {
    public static  void main(){
        
        int array[] = {9, 1, 8 ,2, 7, 3, 6, 4 ,5};
        
        selectionSort(array);

        for (int i:array){
            System.out.print(i);
        }

    }

    private static void selectionSort(int[] array) {

        for(int i = 0; i < array.length - 1; i++){
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++){

                if(array[minIndex] > array[j]){ //desc <
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex]; //array[minIndex] = array[i];

            array[minIndex] = temp;
        }
    }
}
