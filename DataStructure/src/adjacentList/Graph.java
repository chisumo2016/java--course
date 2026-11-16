package adjacentList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {
    //arrayList

    ArrayList<LinkedList<Node>>  alist;

    Graph()
    {
        alist = new ArrayList<>();
    }

    void addNode(Node node)
    {
        LinkedList<Node> currentList = new LinkedList<>();
        currentList.add(node);
        alist.add(currentList);
    }

    void addEdge(int src, int dest)
    {
        LinkedList<Node> currentList = alist.get(src);
        Node dstNode = alist.get(dest).get(0);
        currentList.add(dstNode);
    }

    public  boolean checkEdge(int src, int dest)
    {
        LinkedList<Node> currentList = alist.get(src);
        Node dstNode = alist.get(dest).get(0);

        for (Node node : currentList)
        {
            if (node == dstNode)  //same
            {
                //System.out.println("Edge exists");
                return true;
            }
        }

        return false;
        //System.out.println("Edge does not exist");
    }

    public void print()
    {
        for (LinkedList<Node> currentList : alist)
        {
            for (Node node : currentList)
            {
                System.out.print(node.data + " -> ");
            }
            System.out.println();
        }
    }
}
