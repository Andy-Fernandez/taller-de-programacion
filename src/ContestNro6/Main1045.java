package ContestNro6;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main1045 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> palabras = new TreeSet<>();

        while (scanner.hasNextLine()) {
            String linea = scanner.nextLine();
            String[] palabrasLinea = linea.split("[^a-zA-Z]+");

            for (String palabra : palabrasLinea) {
                if (!palabra.isEmpty()) {
                    palabras.add(palabra.toLowerCase());
                }
            }
        }

        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}