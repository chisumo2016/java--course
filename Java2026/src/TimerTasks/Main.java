package TimerTasks;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Timer : Class that schedules tasks at specific times or periodically.
         Useful: sending notifications, updating data,scheduled updates, repetitive actions

 TimerTask : Represents a task that will be executed by a Timer.
            You will extend TimerTask class to define your task.
            Create a subclas  of TimerTask and @override run()
 */
public class Main {

    public static void main(String[] args) {

        Timer timer = new Timer();

        //Timer Task
        TimerTask task = new TimerTask() {
            int count = 3;

            //An anonymous class, change the behavior of the task
            @Override
            public void run() {

                System.out.println("Task executed");
                count--;
                if(count <= 0) {
                    System.out.println("TASK COMPLETE");
                    timer.cancel();
                }
            }
        };

        //timer.schedule(task, 3000); //ms

        //periodically
        timer.schedule(task, 0, 1000);

    }
}
