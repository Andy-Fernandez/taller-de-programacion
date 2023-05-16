package ContestNro6;

import java.util.*;

public class Main1216 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()) {
            int n = scanner.nextInt();
            scanner.nextLine();  // To consume the newline

            String[] keywords = scanner.nextLine().split(" ");
            int[] scores = new int[n];
            for(int i = 0; i < n; i++) {
                scores[i] = scanner.nextInt();
            }
            scanner.nextLine();  // To consume the newline

            String answer = scanner.nextLine();
            String[] answerWords = answer.split(" ");
            Set<String> answerSet = new HashSet<>(Arrays.asList(answerWords));

            int totalScore = 0;
            for(int i = 0; i < n; i++) {
                if(answerSet.contains(keywords[i])) {
                    totalScore += scores[i];
                }
            }
            System.out.println(totalScore);
        }
        scanner.close();
    }
}
