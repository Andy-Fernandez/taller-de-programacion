package estructuras;

import java.util.PriorityQueue;

public class Manejo_ColaPrioridad {
    public static void main(String[] args) {
        PriorityQueue<Integer> miColaPrioridad = new PriorityQueue<Integer>();
        miColaPrioridad.offer(59); //adicionando datos
        miColaPrioridad.offer(5);
        miColaPrioridad.offer(6);
        miColaPrioridad.offer(1);
        miColaPrioridad.offer(885);
        miColaPrioridad.offer(5);

        System.out.println(miColaPrioridad);
        System.out.println();
        System.out.println(miColaPrioridad.size()); //tamaño de la cola
        System.out.println(miColaPrioridad.peek()); //consulta elemento que se encuentra al principio

        int dato = miColaPrioridad.poll(); //elimina el elemento
        System.out.println(dato);
        System.out.println(miColaPrioridad.peek());
        System.out.println();
        System.out.println(miColaPrioridad.isEmpty()); //verifica si esta vacía la cola

        while (!miColaPrioridad.isEmpty()) {
            System.out.println(miColaPrioridad.poll());
        }
    }
}