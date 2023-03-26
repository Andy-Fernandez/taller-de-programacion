package ejecicioCalcularOn;

// Ejercicio 1915 - Operaciones Máximas
// https://jv.umsa.bo/problem.php?cid=2594&pid=2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxInSlidingWindow {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim()); // lee el número de elementos en la lista
        int[] numbers = new int[N]; // crea una lista de tamaño N

        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(br.readLine().trim()); // lee cada elemento de la lista
        }

        findMaxInSlidingWindow(numbers); // llama a la función findMaxInSlidingWindow para encontrar el máximo en las ventanas deslizantes
    }

    private static void findMaxInSlidingWindow(int[] numbers) {
        int n = numbers.length; // obtiene el tamaño de la lista
        for (int i = 0; i <= n - 4; i++) { // itera sobre las ventanas deslizantes
            int max = Math.max(Math.max(numbers[i], numbers[i + 1]), Math.max(numbers[i + 2], numbers[i + 3])); // encuentra el máximo en la ventana actual
            System.out.println(max); // imprime el máximo en la ventana actual
        }
    }
}
