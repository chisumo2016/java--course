package binaryTree;
/*
   Binary search tree :A tree data structure , where each node is greater than it's left child , but less than it's right child

       benefit : easy to locate a note when they are in this order .
       time complexity : best case O(log n)
                         worst case O(n)

      space complexity : O(n)
 */
public class Main {

    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(new Node(5));
        tree.insert(new Node(1));
        tree.insert(new Node(9));
        tree.insert(new Node(2));
        tree.insert(new Node(7));
        tree.insert(new Node(3));
        tree.insert(new Node(6));
        tree.insert(new Node(4));
        tree.insert(new Node(8));

        tree.remove(9);
        tree.display();

        System.out.println(tree.search(1));

        tree.remove(5);
        //System.out.println(tree.search(1));


    }
}
