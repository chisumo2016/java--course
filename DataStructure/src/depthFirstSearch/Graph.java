package depthFirstSearch;


import java.util.ArrayList;

public class Graph {

    ArrayList<Node> nodes;
    int[][] matrix;

    Graph(int size)
    {
        nodes = new ArrayList<>();
        matrix = new int[size][size]; // eg 5 x 5
    }

    public  void addNode(Node node)
    {
        nodes.add(node);
    }
    public void addEdge(int src, int dest)
    {
        matrix[src][dest] = 1;
    }

    public boolean checkEdge(int src, int dest)
    {
        if (matrix[src][dest] == 1 ){
            return  true;

        }
        //return matrix[source][destination] == 1;
        return false;
    }

    public  void print()
    {
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

    public  void depthFirstSearch(int src) {

        boolean[] visited = new boolean[matrix.length];
        dFsHelper(src, visited);
    }

    private void dFsHelper(int src, boolean[] visited) {

        if (visited[src])
            return;

        visited[src] = true;
        System.out.println(nodes.get(src).data + " = visited ");

        for (int i = 0; i < matrix[src].length; i++) {
            if (matrix[src][i] == 1 ) //&& !visited[i]
                dFsHelper(i, visited);
        }

        return;
    }


}
