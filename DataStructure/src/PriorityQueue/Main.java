package PriorityQueue;

import java.util.*;

/*
    Priority Queues : a FIFO data structure that serves elements with the HIGH PRIORITIES  first.
                    before elements with LOW priority .

                    is interface
 */
public class Main {
    public static void main(String[] args) {

        //Queue<Double> queue = new LinkedList<>();
        //Queue<Double> queue = new PriorityQueue<>();
        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

        // add
        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        //Display
       while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
