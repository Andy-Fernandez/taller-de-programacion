package ejecicioCalcularOn;

// Ejercicio 1619 - Operaciones Máximas
// https://jv.umsa.bo/problem.php?cid=2594&pid=1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxOperation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input;
        while ((input = br.readLine()) != null && !input.trim().isEmpty()) { // bucle que lee la entrada mientras haya más líneas y la línea no esté vacía
            StringTokenizer st = new StringTokenizer(input); // divide la línea en tokens
            int A = Integer.parseInt(st.nextToken()); // convierte el primer token en un entero
            int B = Integer.parseInt(st.nextToken()); // convierte el segundo token en un entero
            int maxResult = findMaxOperation(A, B); // llama a la función findMaxOperation para determinar el resultado máximo de las operaciones
            System.out.println(maxResult); // imprime el resultado máximo
        }
    }

    private static int findMaxOperation(int A, int B) {
        int sum = A + B; // calcula la suma de A y B
        int difference = A - B; // calcula la diferencia entre A y B
        int product = A * B; // calcula el producto de A y B
        return Math.max(Math.max(sum, difference), product); // devuelve el máximo de la suma, la diferencia y el producto
    }
}
