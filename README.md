Graph Traversal and Representation System
Project Overview
This project demonstrates graph traversal algorithms using Java. The graph is represented with an adjacency list structure. The program implements Breadth-First Search (BFS) and Depth-First Search (DFS) algorithms.
A graph consists of vertices and edges. Vertices represent nodes, and edges represent connections between nodes. The program creates graphs of different sizes and measures traversal performance.
BFS explores vertices level by level using a queue. DFS explores vertices deeply before backtracking using recursion.

Class Descriptions
Vertex Class
The Vertex class represents a node in the graph.
Fields:


id — unique vertex identifier


Methods:


Constructor


Getter


toString()



Edge Class
The Edge class represents a connection between two vertices.
Fields:


source — starting vertex


destination — ending vertex


Methods:


Constructor


Getters


toString()



Graph Class
The Graph class stores the graph using an adjacency list.
The adjacency list connects each vertex to a list of neighboring vertices. This representation is memory efficient and works well for traversal algorithms.
Methods:


addVertex(Vertex v)


addEdge(int from, int to)


printGraph()


bfs(int start)


dfs(int start)



Algorithm Descriptions
Breadth-First Search (BFS)
BFS visits vertices level by level.
Steps:


Start from the selected vertex


Add the vertex to a queue


Mark the vertex as visited


Remove a vertex from the queue


Visit all unvisited neighbors


Repeat until the queue becomes empty


BFS uses a queue data structure.
Use Cases


Shortest path in unweighted graphs


Network traversal


Social network analysis


Time Complexity
O(V+E)O(V+E)O(V+E)
Where:


V = number of vertices


E = number of edges



Depth-First Search (DFS)
DFS explores one path completely before returning.
Steps:


Start from the selected vertex


Mark the vertex as visited


Visit one unvisited neighbor


Continue deeper recursively


Backtrack when no neighbors remain


DFS uses recursion or a stack.
Use Cases


Path finding


Cycle detection


Topological sorting


Time Complexity
O(V+E)O(V+E)O(V+E)

Experimental Results
Graph SizeBFS Time (ns)DFS Time (ns)10 vertices1200009500030 vertices210000180000100 vertices530000470000

Observations
As graph size increases, execution time also increases. Both BFS and DFS show similar performance because both algorithms have complexity O(V + E).
In these experiments DFS was slightly faster because recursion required fewer queue operations.
Graph structure affects traversal order because BFS visits vertices level by level, while DFS explores deeply first.
BFS is preferred when the shortest path is needed.
DFS limitations:


Can go very deep in large graphs


Recursive implementation may cause stack overflow


Does not guarantee shortest path



Screenshots
Include screenshots of:


Graph structure output


BFS traversal output


DFS traversal output


Performance results



Reflection
In this assignment I learned how graph traversal algorithms work and how adjacency lists store graph connections efficiently. I also learned how BFS and DFS explore graphs differently.
The most challenging part was implementing DFS recursion and understanding how visited vertices prevent infinite loops. I also learned how execution time changes when graph size becomes larger.
