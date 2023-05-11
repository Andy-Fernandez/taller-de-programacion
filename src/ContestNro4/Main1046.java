package ContestNro4;
import java.util.*;

public class Main1046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int n = scanner.nextInt(); // Número de comandos
            boolean isStack = true, isQueue = true, isPriorityQueue = true;
            Stack<Integer> stack = new Stack<>();
            Queue<Integer> queue = new LinkedList<>();
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

            for (int i = 0; i < n; i++) {
                int commandType = scanner.nextInt();
                int x = scanner.nextInt();

                if (commandType == 1) {
                    stack.push(x);
                    queue.add(x);
                    priorityQueue.add(x);
                } else {
                    if (isStack && (stack.isEmpty() || stack.pop() != x)) {
                        isStack = false;
                    }
                    if (isQueue && (queue.isEmpty() || queue.poll() != x)) {
                        isQueue = false;
                    }
                    if (isPriorityQueue && (priorityQueue.isEmpty() || priorityQueue.poll() != x)) {
                        isPriorityQueue = false;
                    }
                }
            }

            if (!isStack && !isQueue && !isPriorityQueue) {
                System.out.println("impossible");
            } else if ((isStack && isQueue) || (isStack && isPriorityQueue) || (isQueue && isPriorityQueue)) {
                System.out.println("not sure");
            } else if (isStack) {
                System.out.println("stack");
            } else if (isQueue) {
                System.out.println("queue");
            } else if (isPriorityQueue) {
                System.out.println("priority queue");
            }
        }
    }
}
