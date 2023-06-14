package Tareas.Tarea11;

public class ProyectoFinal {
    public static void main(String args[]) {
        // Primer grafo
        Tareas.Tarea11.Graph graph1 = new Tareas.Tarea11.Graph(11);
        graph1.addEdge(1, 2);
        graph1.addEdge(1, 8);
        graph1.addEdge(2, 3);
        graph1.addEdge(2, 4);
        graph1.addEdge(2, 7);
        graph1.addEdge(3, 5);
        graph1.addEdge(3, 6);
        graph1.addEdge(4, 9);
        graph1.addEdge(5, 4);
        graph1.addEdge(5, 6);
        graph1.addEdge(7, 8);
        graph1.addEdge(9, 6);
        graph1.addEdge(9, 10);


        System.out.println("Primer Grafo");
        System.out.println("DFS:");
        System.out.println("Comenzando del vertice " + 1 + ":");
        Tareas.Tarea11.DFS dfs1 = new Tareas.Tarea11.DFS(graph1.getVertices());
        dfs1.dfs(graph1, 1);
        System.out.println();
        /*
        System.out.println("BFS traversal starting from each vertex:");
        System.out.println("Starting from vertex " + 1 + ":");
        Tareas.Tarea11.BFS bfs1 = new Tareas.Tarea11.BFS(graph1.getVertices());
        bfs1.bfs(graph1, 1);
        System.out.println();
        // Grafo A
        Graph graphA = new Graph(7);
        graphA.addEdge(1, 3);
        graphA.addEdge(2, 1);
        graphA.addEdge(2, 3);
        graphA.addEdge(2, 4);
        graphA.addEdge(4, 5);
        graphA.addEdge(4, 6);
        graphA.addEdge(5, 6);

        // Grafo B
        Graph graphB = new Graph(9);
        graphB.addEdge(3, 5);
        graphB.addEdge(4, 3);
        graphB.addEdge(4, 5);
        graphB.addEdge(4, 6);
        graphB.addEdge(6, 7);
        graphB.addEdge(6, 8);
        graphB.addEdge(7, 8);

        // Comprobar si B es un desplazamiento de 2 sobre A
        boolean esGrafoDesplazado = graphA.esGrafoDesplazado(graphB, 2);
        System.out.println("El grafo B es un desplazamiento de 2 sobre el grafo A: " + esGrafoDesplazado);
        esGrafoDesplazado = graphA.esGrafoDesplazado(graphB, 1);
        // Comprobar si B es un desplazamiento de 2 sobre A
        System.out.println("El grafo B es un desplazamiento de 1 sobre el grafo A: " + esGrafoDesplazado);
        */
    }
}
