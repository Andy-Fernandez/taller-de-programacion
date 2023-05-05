package ejeciciosEnClases;
import java.util.Scanner;
import java.util.PriorityQueue;

public class Main1148 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PriorityQueue<Integer> cp = new PriorityQueue<Integer>();
        //Si queremos revertir el orden de la cola de prioridad, podemos usar Collections.reverseOrder():
        //PriorityQueue<Integer> cp = new PriorityQueue<Integer>(Collections.reverseOrder());
        int n = leer.nextInt();
        while(n != 0) {
            for (int i = 0; i < n; i++) {
                cp.offer(leer.nextInt());
            }
            //System.out.println(cp);
            int costo = 0, total = 0;
            if (!cp.isEmpty()) {
                while (!cp.isEmpty()) {
                    costo = cp.poll() + cp.poll();
                    total = total + costo;
                    if (!cp.isEmpty())
                        cp.offer(costo);
                }
                System.out.println(total);
            }
            n = leer.nextInt();
        }
    }
}
