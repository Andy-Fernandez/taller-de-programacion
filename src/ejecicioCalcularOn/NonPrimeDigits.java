package ejecicioCalcularOn;

// Ejercicio 2076 - NonPrimeDigits
// https://jv.umsa.bo/problem.php?cid=2594&pid=3

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NonPrimeDigits {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim()); // lee el número de casos de prueba
        int count = 0; // lleva un registro del número de casos en los que no se encuentra ningún dígito no primo
        StringBuilder composedNumber = new StringBuilder(); // construye el número compuesto a partir del dígito no primo más pequeño de cada caso de prueba

        for (int i = 0; i < n; i++) { // itera sobre cada caso de prueba
            String number = br.readLine().trim(); // lee el número de cada caso de prueba
            int minNonPrimeDigit = findMinNonPrimeDigit(number); // encuentra el dígito no primo más pequeño en el número
            if (minNonPrimeDigit != -1) { // si se encuentra un dígito no primo
                composedNumber.append(minNonPrimeDigit); // agrega el dígito no primo al número compuesto
            } else {
                count++; // si no se encuentra ningún dígito no primo, aumenta el contador
            }
        }

        System.out.println(composedNumber); // imprime el número compuesto
        System.out.println(count); // imprime el número de casos en los que no se encuentra ningún dígito no primo
    }

    private static int findMinNonPrimeDigit(String number) {
        int minNonPrimeDigit = 10; // establece un valor inicial alto para el dígito no primo más pequeño

        for (char c : number.toCharArray()) { // itera sobre cada dígito en el número
            int digit = c - '0'; // convierte el dígito de char a int
            if (!isPrime(digit) && digit < minNonPrimeDigit) { // verifica si el dígito no es primo y es menor que el dígito no primo más pequeño actual
                minNonPrimeDigit = digit; // actualiza el dígito no primo más pequeño
            }
        }

        return minNonPrimeDigit == 10 ? -1 : minNonPrimeDigit; // si no se encuentra ningún dígito no primo, devuelve -1
    }

    private static boolean isPrime(int n) { // verifica si un número es primo
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

