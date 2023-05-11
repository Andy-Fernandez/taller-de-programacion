package ejeciciosEnClases;
import java.util.Scanner;
import java.util.PriorityQueue;

public class Main1148_2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PriorityQueue<Integer> cp = new PriorityQueue<Integer>();
        int n = leer.nextInt();
        while(n != 0) {
            for (int i = 0; i < n; i++) {
                cp.offer(leer.nextInt());
            }
            int costo = 0, total = 0;
            while (cp.size() > 1) { // Cambiar la condición aquí
                int a = cp.poll();
                int b = cp.poll();
                costo = a + b;
                total = total + costo;
                cp.offer(costo); // Agregar el costo de nuevo a la PriorityQueue
            }
            System.out.println(total);
            cp.clear(); // Vaciar la PriorityQueue antes de continuar con el siguiente caso de prueba
            n = leer.nextInt();
        }
    }
}