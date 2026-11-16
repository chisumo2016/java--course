package Threading;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        //Run  in background
        for (int i = 1; i <=10; i++) {
            //System.out.println("You have " + (5 - i) + " seconds to enter your name");
            try {
                //current thread is paused for 1 second
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }

            if (i == 10){
                System.out.println("Time's up!");
                System.exit(0);// end the program
            }
        }
    }

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}
