# Bonus Task – Dijkstra Algorithm

This project was extended with Dijkstra’s Algorithm.

The graph now supports weighted edges.  
Each edge contains:
- destination vertex
- weight

The dijkstra(int start) method finds the shortest path from the starting vertex to all other vertices.

The algorithm:
1. Stores distances in an array
2. Finds the minimum unvisited vertex
3. Updates shorter paths
4. Repeats until all vertices are visited

The implementation uses:
- adjacency list
- arrays
- loops

No priority queue was used.
