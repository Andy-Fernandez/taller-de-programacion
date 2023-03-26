package ejecicioCalcularOn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//problema 2594 - GANDEY vs GHATAK
//https://jv.umsa.bo/problem.php?cid=2594&pid=0

public class GANDEYvsGHATAK {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            String winner = findWinner(N);
            sb.append(winner).append("\n");
        }

        System.out.print(sb.toString());
    }

    private static String findWinner(int N) {
        int turn = 0; // 0 para GANDEY, 1 para GHATAK

        while (N > 1) {
            int sqrt = (int) Math.sqrt(N);

            if (sqrt * sqrt == N) {
                N = sqrt;
            } else {
                N -= 1;
            }

            turn = 1 - turn;
        }

        return turn == 1 ? "GANDEY" : "GHATAK";
    }
}
