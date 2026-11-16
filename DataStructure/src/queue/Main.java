package queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Queue : FIFO data structure .Fisrt-In first-Out (eg A Line of people)
        a collection designed for holding elements prior to processing
         used in :
            1. CPU scheduling
            2. Disk scheduling
            3. Call center phone systems
            4. CPU scheduling
            5. Disk scheduling
            6. Call center phone systems
            7. Backtracking algorithms (maze , file directory)
            8. calling functions (call stack)
        Linear data structure :ege large of people waiting in line like supermarket, shop
            add = enqueue, offer()       Tail of the line/front
            remove = dequeue , poll()     eg head of the lin
 */
public class Main {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        /*Add element to a queue*/
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");


        /*To look an element a head of the queue*/
        System.out.println(queue.peek());

        /*To remove an element from the queue*/
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();

        /*Check the size of our queue*/
        System.out.println(queue.size());

        /*Check the cettain object we're looking for*/
        System.out.println(queue.contains("Karen"));


        /*Check if our queue is empty*/
        System.out.println(queue.isEmpty());

        /*Display all elements in the queue*/
        System.out.println(queue);
    }
}
