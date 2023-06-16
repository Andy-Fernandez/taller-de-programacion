package Tareas.Tarea10;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GrafoMatrizAdyacencia {
    private boolean dirigido;
    private int maxNodos;
    private int numVertices;
    private boolean matrizAdyacencia[][];
    private int peso[][];

    public GrafoMatrizAdyacencia(int numVertices, boolean dirigido) {
        this.maxNodos = 50;
        this.numVertices = numVertices;
        this.dirigido = dirigido;
        this.matrizAdyacencia = new boolean[maxNodos][maxNodos];
        this.peso = new int[maxNodos][maxNodos];
    }

    public void insertaArista(int verticeOrigen, int verticeDestino) {
        this.matrizAdyacencia[verticeOrigen][verticeDestino] = true;
        if (!dirigido)
            matrizAdyacencia[verticeDestino][verticeOrigen] = true;
    }

    public void insertaArista(int verticeOrigen, int verticeDestino, int costo) {
        this.matrizAdyacencia[verticeOrigen][verticeDestino] = true;
        this.peso[verticeOrigen][verticeDestino] = costo;
        if (!dirigido)
            this.peso[verticeDestino][verticeOrigen] = costo;
            matrizAdyacencia[verticeDestino][verticeOrigen] = true;
    }


    public void eliminaArista(int verticeOrigen, int verticeDestino) {
        this.matrizAdyacencia[verticeOrigen][verticeDestino] = false;
        if (!dirigido)
            matrizAdyacencia[verticeDestino][verticeOrigen] = false;
    }

    public void insertaVertices(int n) {
        if (maxNodos - numVertices < n)
            System.out.println("Error: se supera el máximo número de nodos.");
        else {
            for (int i = 0; i < numVertices; i++) {
                for (int j = 0; j < numVertices + n; j++) {
                    matrizAdyacencia[i][j] = matrizAdyacencia[j][i] = false;
                }
            }
        }
        numVertices = numVertices + n;
    }

    public boolean existeArista(int verticeOrigen, int verticeDestino) {
        return matrizAdyacencia[verticeOrigen][verticeDestino];
    }

    public void imprimeGrafo() {
        System.out.println("La matriz contiene: " + this.numVertices + " vértices \n");
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                if (matrizAdyacencia[i][j])
                    System.out.print(" 1");
                else
                    System.out.print(" 0");
            }
            System.out.println();
        }
    }
    public void imprimeGrafoPeso() {
        System.out.println("La matriz contiene: " + this.numVertices + " vértices \n");
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                if (matrizAdyacencia[i][j])
                    System.out.print(" " + peso[i][j]);
                else
                    System.out.print(" 0");
            }
            System.out.println();
        }
    }
    public void imprimeListaAdyacencia() {
        System.out.println("Lista de adyacencia del grafo: ");
        for (int i = 0; i < numVertices; i++) {
            System.out.print("Vértice " + (i+1) + ": ");
            for (int j = 0; j < numVertices; j++) {
                if (matrizAdyacencia[i][j])
                    System.out.print((j+1) + " ");
            }
            System.out.println();
        }
    }
    public void imprimeListaAdyacenciaPeso() {
        System.out.println("Lista de adyacencia del grafo con pesos: ");
        for (int i = 0; i < numVertices; i++) {
            System.out.print("Vértice " + (i+1) + ": ");
            for (int j = 0; j < numVertices; j++) {
                if (matrizAdyacencia[i][j])
                    System.out.print("V" + (j+1) + ":" + peso[i][j] + "  ");
            }
            System.out.println();
        }
    }

    // Grado de entrada
    public int gradoInterno(int vertice) {
        int contador = 0;
        for (int j = 0; j < numVertices; j++) {
            if (matrizAdyacencia[j][vertice])
                contador++;
        }
        return contador;
    }

    // Grado de salida
    public int gradoExterno(int vertice) {
        int contador = 0;
        for (int j = 0; j < numVertices; j++) {
            if (matrizAdyacencia[vertice][j])
                contador++;
        }
        return contador;
    }
    public void recorridoBFS(int verticeInicial) {
        boolean[] visitado = new boolean[numVertices];
        Queue<Integer> cola = new LinkedList<>();

        visitado[verticeInicial] = true;
        cola.offer(verticeInicial);

        System.out.println("Recorrido BFS desde el vértice " + (verticeInicial + 1) + ":");
        while (!cola.isEmpty()) {
            int verticeActual = cola.poll();
            System.out.print((verticeActual + 1) + " ");

            for (int i = 0; i < numVertices; i++) {
                if (matrizAdyacencia[verticeActual][i] && !visitado[i]) {
                    visitado[i] = true;
                    cola.offer(i);
                }
            }
        }
        System.out.println();
    }

    // Recorrido DFS (Depth-First Search)
    public void recorridoDFS(int verticeInicial) {
        boolean[] visitado = new boolean[numVertices];
        Stack<Integer> pila = new Stack<>();

        visitado[verticeInicial] = true;
        pila.push(verticeInicial);

        System.out.println("Recorrido DFS desde el vértice " + (verticeInicial + 1) + ":");
        while (!pila.isEmpty()) {
            int verticeActual = pila.pop();
            System.out.print((verticeActual + 1) + " ");

            for (int i = 0; i < numVertices; i++) {
                if (matrizAdyacencia[verticeActual][i] && !visitado[i]) {
                    visitado[i] = true;
                    pila.push(i);
                }
            }
        }
        System.out.println();
    }
    public int grado(int vertice) {
        return ((gradoInterno(vertice) + gradoExterno(vertice)) / 2);
    }
}
