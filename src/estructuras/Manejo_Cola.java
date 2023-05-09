package estructuras;

import java.util.LinkedList;
import java.util.Queue;

public class Manejo_Cola {
    public static void main(String[] args) {
        Queue<String> miCola = new LinkedList<String>();
        // añadimos 4 elementos
        miCola.offer("Programacion");
        miCola.offer("Taller");
        miCola.offer("INF 143");
        miCola.offer("Cola");
        System.out.println(miCola);
        System.out.println(miCola.size()); // número de elementos
        System.out.println(miCola.peek()); // consulta el primer elemento
        miCola.poll(); // elimina el primer elemento
        System.out.println(miCola.peek()); // consulta el primer elemento
        System.out.println(miCola.isEmpty()); // comprueba si la cola está vacía
        while (!miCola.isEmpty()) {
            System.out.println(miCola.poll()); // mostramos los elementos
        }
    }
}