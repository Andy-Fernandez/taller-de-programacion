package ContestNro6;
import java.util.*;

public class Main1122 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            int E = scanner.nextInt();

            Map<String, Integer> pokemonExp = new HashMap<>();

            for (int j = 0; j < N; j++) {
                String pokemon = scanner.next();
                pokemonExp.put(pokemon, pokemonExp.getOrDefault(pokemon, 0) + E);
            }

            int[] levels = new int[M];
            for (int k = 0; k < M; k++) {
                levels[k] = scanner.nextInt();
            }

            int maxLevel = 0;
            for (Integer exp : pokemonExp.values()) {
                int level = 0;
                while (level < M && exp >= levels[level]) {
                    exp -= levels[level];
                    level++;
                }
                maxLevel = Math.max(maxLevel, level);
            }

            System.out.println(maxLevel);
        }

        scanner.close();
    }
}