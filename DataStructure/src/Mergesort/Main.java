package Mergesort;
/*
    Merge sort :
 */
public class Main {
    public static  void main(String[] args){
        int[] array = { 8 , 2 , 5 , 3 , 4, 7, 6 ,1};

        mergeSort(array);

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

    }

    private static void mergeSort(int[] array) {
       // lentgh of array
       int length = array.length;
       if (length < 1)
           return; //base case

        int middle = length / 2;
        int[] leftArray =new int[ middle];
        int[] rightArray = new int[length - middle];

        int i = 0; // left array
        int j = 0; //right array

        for ( ; i < length; i++){
            if (i < middle)
                leftArray[i] = array[i];
            else
                rightArray[j] = array[i];
                j++;

        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray , rightArray , array);

    }

    private static void merge(int[] array, int[] leftArray, int[] rightArray) { // int mid,

        // cache the size
        int leftSize = array.length /2 ;
        int rightSize = array.length - leftSize;

        // indices
        int i = 0;
        int l = 0;
        int r = 0;

        // check the conditions for merging

        while(l < leftSize && r < rightSize){
            //smaller
            if (leftArray[l] < rightArray[r]){
                array[i] = leftArray[l];
                i++;
                l++;

            }else {
                array[i] = rightArray[r];
                r++;
                i++;
            }

        }
        while(l < leftSize){
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while(r < rightSize){
            array[i] = rightArray[r];

        }

    }
}
