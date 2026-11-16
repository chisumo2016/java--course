package arrays;

public class Demo2 {

   static  void printArray(int b[]){

       System.out.println("Elements in the array are :");

       for(int i = 0; i < b.length; i++){
           System.out.println(b[i]);
       }
   }

    static  void setZero(int b[]){

        for(int i = 0; i < b.length; i++){
            b[i] = 0;
        }
    }

    public static void main(String[] args) {

        int arr[] = {10, 20 , 30 , 40 , 50};

         printArray(arr);// passing the address of the array

         setZero(arr);
         System.out.println();
         printArray(arr);
    }
}
