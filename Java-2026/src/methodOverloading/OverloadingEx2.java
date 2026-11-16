package methodOverloading;

class SearchUtil{

    // return the index of the element if found else return -1
    public static int search (int arr[] , int element){

        for(int i=0; i<arr.length; i++){
            if(arr[i] == element){
                return i;
            }
        }
        return -1;
    }

    public static int search (int arr[] , int position, int element ){

        for(int i=position; i<arr.length; i++){
            if(arr[i] == element){
                return i;
            }
        }
        return -1;
    }
}


public class OverloadingEx2 {

    public static void main(String[] args) {

        int arra[] = { 10 , 20 , 30 , 10 , 20 , 40 , 20  };
        int searchElement = 20;
        int index = -1;

        do {
             index = SearchUtil.search(arra,  index + 1 ,searchElement  );
            if (index != -1) {
                System.out.println("Element found at index -: " + index);
            }

        }while(index != -1);

    }
}
