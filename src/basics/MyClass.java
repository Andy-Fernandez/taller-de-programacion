package basics;
import java.util.Random;

import java.util.Scanner;
public class MyClass {
    public static void main(String[] args) {
        int n = 100000;
        int[] numeros = new int[n];
        for (int i = 0; i < n; i++) {
            numeros[i] = i + 1;
        }
        desordenar(numeros);
        for (int i = 0; i < n; i++) {
            System.out.print(numeros[i] + " ");
        }
    }

    public static void desordenar(int[] numeros) {
        Random rnd = new Random();
        for (int i = numeros.length - 1; i > 0; i--) {
            int j = rnd.nextInt(i + 1);
            int temp = numeros[i];
            numeros[i] = numeros[j];
            numeros[j] = temp;
        }
        // Eliminar repeticiones
        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] == numeros[i + 1]) {
                numeros[i]++;
                i = -1;
            }
        }
    }
}
