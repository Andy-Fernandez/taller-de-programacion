package ContestNro6;

import java.util.*;

public class Main1121 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int M = scanner.nextInt();
            TreeSet<String> avengers = new TreeSet<>();
            for (int i = 0; i < M; i++) {
                int N = scanner.nextInt();
                for (int j = 0; j < N; j++) {
                    avengers.add(scanner.next());
                }
            }

            String avengerA = scanner.next();
            int count = 0;
            for (String avenger : avengers) {
                if (avenger.compareTo(avengerA) < 0) {
                    count++;
                } else {
                    break;
                }
            }

            System.out.println(count);
        }

        scanner.close();
    }
}