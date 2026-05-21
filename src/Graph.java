import java.util.*;

public class Graph {

    private Map<Integer, List<Edge>> adjacencyList;

    public Graph() {
        adjacencyList = new HashMap<>();
    }

    public void addVertex(int v) {
        adjacencyList.putIfAbsent(v, new ArrayList<>());
    }

    public void addEdge(int source, int destination, int weight) {
        addVertex(source);
        addVertex(destination);

        adjacencyList.get(source).add(new Edge(destination, weight));
    }

    public void printGraph() {
        for (int vertex : adjacencyList.keySet()) {
            System.out.print(vertex + ": ");

            for (Edge edge : adjacencyList.get(vertex)) {
                System.out.print(edge + " ");
            }

            System.out.println();
        }
    }

    public void bfs(int start) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        visited.add(start);
        queue.add(start);

        while (!queue.isEmpty()) {
            int current = queue.poll();

            System.out.print(current + " ");

            for (Edge edge : adjacencyList.get(current)) {
                int neighbor = edge.getDestination();

                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }

        System.out.println();
    }

    public void dfs(int start) {
        Set<Integer> visited = new HashSet<>();
        dfsHelper(start, visited);
        System.out.println();
    }

    private void dfsHelper(int current, Set<Integer> visited) {
        visited.add(current);

        System.out.print(current + " ");

        for (Edge edge : adjacencyList.get(current)) {
            int neighbor = edge.getDestination();

            if (!visited.contains(neighbor)) {
                dfsHelper(neighbor, visited);
            }
        }
    }

    public void dijkstra(int start) {

        int size = adjacencyList.size();

        int[] distance = new int[size];
        boolean[] visited = new boolean[size];

        Arrays.fill(distance, Integer.MAX_VALUE);

        distance[start] = 0;

        for (int i = 0; i < size - 1; i++) {

            int current = getMinDistance(distance, visited);

            visited[current] = true;

            for (Edge edge : adjacencyList.get(current)) {

                int neighbor = edge.getDestination();
                int weight = edge.getWeight();

                if (!visited[neighbor]
                        && distance[current] != Integer.MAX_VALUE
                        && distance[current] + weight < distance[neighbor]) {

                    distance[neighbor] = distance[current] + weight;
                }
            }
        }

        System.out.println("Shortest distances from vertex " + start);

        for (int i = 0; i < size; i++) {
            System.out.println(start + " -> " + i + " = " + distance[i]);
        }
    }

    private int getMinDistance(int[] distance, boolean[] visited) {

        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < distance.length; i++) {

            if (!visited[i] && distance[i] < min) {
                min = distance[i];
                minIndex = i;
            }
        }

        return minIndex;
    }
}