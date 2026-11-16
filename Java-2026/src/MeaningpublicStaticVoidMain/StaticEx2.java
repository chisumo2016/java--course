package MeaningpublicStaticVoidMain;
/*
    Static member - Use Case
     Sometimes its good to avoid object creation abd declare the methods as static members
     So that the members are accessible directly using the className without creating an object (Instantiation)
     Ideal for utillities
     Note : But it's not always the case
 */

class ArrayUtil{
    /**
     * Return the index of the element if its found , otherwise return -1
     * @param arr
     * @param element
     * @return
     */
    public static int search(int[] arr, int element){
        for (int i = 0; i < arr.length; i++){
            //found
            if (arr[i] == element){
                return i;
            }
        }
        return -1;
    }

}
public class StaticEx2 {

    public static void main(String[] args){
       int a[] = { 10 , 20 , 30 , 40 };
       int searchElement = 30;

       //ArrayUtil obj = new ArrayUtil();
       int index = ArrayUtil.search(a, searchElement);

       if (index != -1){
           System.out.println("Element found at index : " + index);
       }else{
           System.out.println("Element not found at index : " );
       }

    }
}
