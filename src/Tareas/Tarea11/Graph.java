package Tareas.Tarea11;
import java.util.*;

class Graph {
    private int numVertices;
    private LinkedList<Integer> adjLists[];

    Graph(int vertices) {
        numVertices = vertices;
        adjLists = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjLists[i] = new LinkedList<>();
        }
    }

    void addEdge(int src, int dest) {
        adjLists[src].add(dest);
    }

    LinkedList<Integer>[] getAdjLists() {
        return adjLists;
    }
    public int getVertices() {
        return numVertices;
    }
}
class DFS {
    private boolean visited[];

    DFS(int vertices) {
        visited = new boolean[vertices];
    }

    void dfs(Graph graph, int vertex) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        LinkedList<Integer> list = graph.getAdjLists()[vertex];
        for (Integer v : list) {
            if (!visited[v]) {
                dfs(graph, v);
            }
        }
    }
}
class BFS {
    private boolean visited[];

    BFS(int vertices) {
        visited = new boolean[vertices];
    }

    void bfs(Graph graph, int vertex) {
        LinkedList<Integer> queue = new LinkedList<>();

        visited[vertex] = true;
        queue.add(vertex);

        while (!queue.isEmpty()) {
            int v = queue.poll();
            System.out.print(v + " ");

            LinkedList<Integer> list = graph.getAdjLists()[v];
            for (Integer neighbor : list) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }
}




