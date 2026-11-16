package graphs;

import java.security.PublicKey;
import java.util.ArrayList;

public class Graph {

    ArrayList<Node> nodes;
    //ArrayList<Node> nodes = new ArrayList<>();

    int[][] matrix;

    Graph (int size) { //size is amount of nodes we have

        nodes = new ArrayList<>();
        matrix = new int[size][size]; // eg 5 x 5
    }

    public void addNode(Node node) {
        nodes.add(node);

    }

    public void addEdge(int source, int destination) { //source -rows destination- columns

        matrix[source][destination] = 1;
    }

    public boolean checkEdge(int source, int destination) {

        if (matrix[source][destination] == 1 ){
            return  true;

        }
        //return matrix[source][destination] == 1;
        return false;
    }

    public void print(){
        System.out.print("  ");
        for (Node node : nodes){
            System.out.print(node.data + " ");
        }
        System.out.println();

        for (int i = 0; i < matrix.length; i++) { //rows
            System.out.print(nodes.get(i).data + " ");

            for (int j = 0; j < matrix[i].length; j++) { //columns
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


}
