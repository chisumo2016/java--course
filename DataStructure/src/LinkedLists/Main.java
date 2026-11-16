package LinkedLists;

import java.util.LinkedList;
/*
       LinkedLists : stores Nodes in 2 parts (data and address)
       Nodes are in non-consecutive memory locations
       Elements are linked using pointers

                Singly Linked List
             Node                 Node                  Node
      [data | address ] ->  [data | address ]  ->  [data | address ]


       Doubly Linked List
             Node                 Node                  Node                     Node
      [address | data | address ] <-> [address | data | address ]  <->  [address|data | address ]

      advantage
      Dynamic Data structures (allocate needed memory while running)
      Insertion and deletion of nodes is easy  0(1)
      No/Low memory waste

      disanvatage
      Greater memory usage (additional pointer)
      No random access of elements (no if index [i])
      Accessing/search elements s more time consuming .O(n)

      uses:
      implemenation of stacks and queues
      GPS navigation
      music playlist
 */
public class Main {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<String>();

        /*linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");
        linkedList.pop();*/

        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");

        //linkedList.poll();

        // Add the node
        linkedList.add(4 ,"E");
        linkedList.remove("E");

        //search
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        linkedList.addFirst("0");
        linkedList.addLast("G");

        //REMOVE
        String first = linkedList.removeFirst();
        String last = linkedList.removeLast();
        System.out.println("First removed: " + first);
        System.out.println("Last removed: " + last);

        System.out.println(linkedList);
    }
}
