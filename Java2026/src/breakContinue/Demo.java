package breakContinue;

/**
   break = break out of the loop
   continue = skip the rest of the code in the loop and do the next iteration
            = skip current iteration of a loop (SKIP)
 */
public class Demo {

    public static void main(String[] args) {

        for(int i = 0; i < 10; i++){
                if(i == 5){
                    break;
                }
            System.out.print(i + " ");
        }
    }
}
