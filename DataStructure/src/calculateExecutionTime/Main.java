package calculateExecutionTime;
/**
 *   Calculate execution time
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {

        long startTime = System.nanoTime();

        //--------------- Program----------------------

        Thread.sleep(3000);

        //---------------------------------------------

        long duration = (System.nanoTime() - startTime)/1000000;
        System.out.println("Duration: " + duration + " milliseconds");

    }
}
