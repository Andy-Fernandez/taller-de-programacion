package ejecicioCalcularOn;

//problema 2594 - GANDEY vs GHATAK
//https://jv.umsa.bo/problem.php?cid=2594&pid=0

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GANDEYvsGHATAK {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // lee el número de casos de prueba
        StringBuilder sb = new StringBuilder();

        while (T-- > 0) { // bucle que se ejecuta T veces
            int N = Integer.parseInt(br.readLine()); // lee el número N para cada caso de prueba
            String winner = findWinner(N); // llama a la función findWinner para determinar el ganador del juego
            sb.append(winner).append("\n"); // agrega el resultado al objeto StringBuilder
        }

        System.out.print(sb.toString()); // imprime el resultado
    }

    private static String findWinner(int N) {
        int turn = 0; // 0 para GANDEY, 1 para GHATAK

        while (N > 1) { // el juego continúa hasta que N sea igual a 1
            int sqrt = (int) Math.sqrt(N); // obtiene la raíz cuadrada de N

            if (sqrt * sqrt == N) { // si N es un cuadrado perfecto
                N = sqrt; // reemplaza N con su raíz cuadrada
            } else {
                N -= 1; // resta 1 a N
            }

            turn = 1 - turn; // actualiza el turno
        }

        return turn == 1 ? "GANDEY" : "GHATAK"; // devuelve el ganador del juego
    }
}
