package Threading;

import java.util.Scanner;

/**
 * Threading :Allows a program to run multiple tasks concurrently/simultaneously.
            Helps to improve performance with time-consuming operations.
            (File I/O, network communication, database queries, background tasks etc.)

          How to create threads in Java?
          1. Extending the Thread class (simple and easy to understand) but its remitted
          2. Implementing the Runnable interface (better)
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true); //after main stops
        thread.start();

        System.out.println("You have 10 seconds to enter your name");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("hello" +  name);


        scanner.close();
    }
}


