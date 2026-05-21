public class Main {

    public static void main(String[] args) {

        Graph graph = new Graph();

        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 1);
        graph.addEdge(2, 1, 2);
        graph.addEdge(1, 3, 1);
        graph.addEdge(2, 3, 5);
        graph.addEdge(3, 4, 3);

        System.out.println("Graph:");
        graph.printGraph();

        System.out.println("\nBFS:");
        graph.bfs(0);

        System.out.println("\nDFS:");
        graph.dfs(0);

        System.out.println("\nDijkstra:");
        graph.dijkstra(0);
    }
}