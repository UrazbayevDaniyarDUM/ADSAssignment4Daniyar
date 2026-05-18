public class Experiment {
    private long bfsTime;
    private long dfsTime;

    public void runTraversals(Graph g) {
        long start = System.nanoTime();
        g.bfs(0);
        long end = System.nanoTime();
        bfsTime = end - start;

        start = System.nanoTime();
        g.dfs(0);
        end = System.nanoTime();
        dfsTime = end - start;
    }

    public void runMultipleTests() {
        testGraph(10);
        testGraph(30);
        testGraph(100);
    }

    private void testGraph(int size) {
        Graph graph = createGraph(size);

        System.out.println("Graph with " + size + " vertices");

        if (size == 10) {
            System.out.println("Graph structure:");
            graph.printGraph();

            System.out.println("BFS traversal:");
            long start = System.nanoTime();
            graph.bfs(0);
            long end = System.nanoTime();
            bfsTime = end - start;

            System.out.println("DFS traversal:");
            start = System.nanoTime();
            graph.dfs(0);
            end = System.nanoTime();
            dfsTime = end - start;
        } else {
            long start = System.nanoTime();
            graph.bfs(0);
            long end = System.nanoTime();
            bfsTime = end - start;

            start = System.nanoTime();
            graph.dfs(0);
            end = System.nanoTime();
            dfsTime = end - start;
        }

        printResults();
        System.out.println();
    }

    private Graph createGraph(int size) {
        Graph graph = new Graph();

        for (int i = 0; i < size; i++) {
            graph.addVertex(new Vertex(i));
        }

        for (int i = 0; i < size - 1; i++) {
            graph.addEdge(i, i + 1);
        }

        for (int i = 0; i < size - 2; i += 2) {
            graph.addEdge(i, i + 2);
        }

        return graph;
    }

    public void printResults() {
        System.out.println("BFS time: " + bfsTime + " ns");
        System.out.println("DFS time: " + dfsTime + " ns");
    }
}