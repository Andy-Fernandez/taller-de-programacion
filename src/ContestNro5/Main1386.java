package ContestNro5;
import java.util.*;

public class Main1386 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            LinkedList<Job> queue = new LinkedList<>();
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

            for (int j = 0; j < n; j++) {
                int priority = scanner.nextInt();
                queue.add(new Job(j == m, priority));
                priorityQueue.add(priority);
            }

            int minutes = 0;
            while (true) {
                Job currentJob = queue.pop();
                if (currentJob.priority == priorityQueue.peek()) {
                    minutes++;
                    priorityQueue.poll();
                    if (currentJob.isUserJob) {
                        System.out.println(minutes);
                        break;
                    }
                } else {
                    queue.add(currentJob);
                }
            }
        }
    }

    static class Job {
        boolean isUserJob;
        int priority;

        public Job(boolean isUserJob, int priority) {
            this.isUserJob = isUserJob;
            this.priority = priority;
        }
    }
}
