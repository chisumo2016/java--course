package finalBlock;
/*
   Final Block
        Finally block is executed irrespective of exceptionS
   Generally used for releasing the resources such as closing a file , closing a database connection etc.

   Exxample Usage
       open file
         try{
            read/write
         }
         catch(Exception e){
           handle IOException
         }
         finally{
            close file
         }

   try-with-resources is a simplified version of finally for AutoCloseable resources. (new java feature)

    try(open file){
        read/write
    } catch(IOException){
        handle IOException
    }
 */
class MyExp extends Exception{}


public class FinalBlockEx1 {
    static void f(int a){
        try{
            System.out.println("inside try");

            if(a==1)return;

            if(a==2)throw new MyExp();
            //System.exit(1);

            System.out.println("last statement of try");

        } catch(MyExp e){

            System.out.println("MyExp handler");

        } finally{

            System.out.println("Finally...........");

        }
        System.out.println("after try block");

    }
    public static void main(String[] args) {
       // f(1);
        //f(2);
        f(3);

    }
}
