package arrays;

public class Demo {

   static int  f(int a, int b){
       //logic
        if (a > b)
            return a;
        else
            return b;
    }


    public static void main(String[] args) {
        //int arr[] = {10, 20 , 30 , 40 , 50};
        int x = f(10, 20);
        System.out.println(x);
    }
}
