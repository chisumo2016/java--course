package multithreading;
/*
    Multithreading  : Enables a program to run multiple  threads  concurrently .
        (Thread = A set of instructions that run independently.)
        Useful for background tasks or time-consuming tasks/operations
 */
public class Main {

    public static void main(String[] args) {

        MyRunnable runnable1 = new MyRunnable();
        Thread thread1 = new Thread(runnable1);
        thread1.start();

        MyRunnable runnable2 = new MyRunnable();
        Thread thread2 = new Thread(runnable2);
        thread2.start();
    }
}
