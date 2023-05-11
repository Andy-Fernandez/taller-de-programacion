package ejerciciosEnClases;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Collections;

public class Main1386 {
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        PriorityQueue<Integer> cp = new PriorityQueue<Integer>(Collections.reverseOrder());
        char op = lee.next().charAt(0);
        int x;
        while (op != 'T'){
            switch (op) {
                case 'S':
                    x = lee.nextInt();
                    cp.offer(x);
                    break;
                case 'A':
                    if (!cp.isEmpty())
                        System.out.println(cp.peek());
                    else System.out.println("Error");
                    break;
                case 'R':
                    if (!cp.isEmpty())
                        cp.poll();
                    else System.out.println("Error");
                    break;
                case 'I':
                    if (!cp.isEmpty()) {
                        x = lee.nextInt();
                        cp.offer(cp.poll() + x);
                    } else {
                        System.out.println("Error");
                    }
                    break;
                case 'D':
                    if (!cp.isEmpty()) {
                        x = lee.nextInt();
                        cp.offer(cp.poll() - x);
                    } else {
                        System.out.println("Error");
                    }
                    break;
            }
            op = lee.next().charAt(0);
        }
    }
}