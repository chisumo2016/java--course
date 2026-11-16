package breadtthFirstSearch;



/*
     BFS : A search algorithm for traversing or searching tree or graph data structures.
          This is done one "level" and a time , rather than one "branch" at a time. using queue

          Traverse a graph level by level
          Utilizes a Queue
          Better if destination us on average close to start
          Siblings are visited before children

     DFS  Transerve a graph branch by branch
          Utilizes a Stack
          Better if destination is on average far from the
          Children are visited before siblings
          More popular for games/puzzles

 */
public class Main {

    public static void main(String[] args) {

        Graph graph = new Graph(5);

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.print();

        graph.breadthFirstSearch(0);

    }
}
