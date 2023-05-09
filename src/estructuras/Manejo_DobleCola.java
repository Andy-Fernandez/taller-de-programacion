package estructuras;

import java.util.Deque;
import java.util.LinkedList;

public class Manejo_DobleCola {
    public static void main(String[] args) {
        Deque<String> miDobleCola = new LinkedList<String>();
        miDobleCola.offerFirst("Programacion"); //adiciona al principio
        miDobleCola.offerFirst("Taller");
        miDobleCola.offerLast("INF - 143"); //adiciona al final
        miDobleCola.offerLast("Doble Cola");

        System.out.println(miDobleCola);
        System.out.println(miDobleCola.size()); //número de elementos

        System.out.println(miDobleCola.peekFirst()); //consulta el elemento del principio
        System.out.println(miDobleCola.peekLast()); //consulta el elemento del final

        miDobleCola.pollFirst(); //elimina el elemento del principio
        miDobleCola.pollLast(); //elimina el elemento del final

        System.out.println();

        System.out.println(miDobleCola.peekFirst());
        System.out.println(miDobleCola.peekLast());

        System.out.println();

        System.out.println(miDobleCola.isEmpty()); //verifica si está vacía

        System.out.println();

        while (!miDobleCola.isEmpty()) {
            System.out.println(miDobleCola.pollFirst());
        }
    }
}
