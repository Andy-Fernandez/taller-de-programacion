package Tareas.Tarea11;

public class Main {
    public static void main(String args[]) {
        // Primer grafo
        Graph graph1 = new Graph(5);

        graph1.addEdge(0, 1);
        graph1.addEdge(2, 0);
        graph1.addEdge(2, 3);
        graph1.addEdge(3, 1);
        graph1.addEdge(3, 0);
        graph1.addEdge(4, 1);
        graph1.addEdge(4, 3);
        graph1.addEdge(4, 4);

        System.out.println("Primer Grafo");
        System.out.println("DFS traversal starting from each vertex:");
        for (int i = 0; i < graph1.getVertices(); i++) {
            System.out.println("Starting from vertex " + i + ":");
            DFS dfs1 = new DFS(graph1.getVertices());
            dfs1.dfs(graph1, i);
            System.out.println();
        }

        System.out.println("BFS traversal starting from each vertex:");
        for (int i = 0; i < graph1.getVertices(); i++) {
            System.out.println("Starting from vertex " + i + ":");
            BFS bfs1 = new BFS(graph1.getVertices());
            bfs1.bfs(graph1, i);
            System.out.println();
        }

        // Segundo grafo
        Graph graph2 = new Graph(6);

        graph2.addEdge(0, 1);
        graph2.addEdge(0, 2);
        graph2.addEdge(0, 3);
        graph2.addEdge(1, 5);
        graph2.addEdge(1, 2);
        graph2.addEdge(2, 4);
        graph2.addEdge(3, 4);
        graph2.addEdge(4, 5);
        graph2.addEdge(5, 5);

        System.out.println("Segundo Grafo");
        System.out.println("DFS traversal starting from each vertex:");
        for (int i = 0; i < graph2.getVertices(); i++) {
            System.out.println("Starting from vertex " + i + ":");
            DFS dfs2 = new DFS(graph2.getVertices());
            dfs2.dfs(graph2, i);
            System.out.println();
        }

        System.out.println("BFS traversal starting from each vertex:");
        for (int i = 0; i < graph2.getVertices(); i++) {
            System.out.println("Starting from vertex " + i + ":");
            BFS bfs2 = new BFS(graph2.getVertices());
            bfs2.bfs(graph2, i);
            System.out.println();
        }
    }
}
