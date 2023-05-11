package ContestNro4;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main1986 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea después del entero testCases

        for (int i = 0; i < testCases; i++) {
            String message = scanner.nextLine();
            if (detectSarcasm(message)) {
                System.out.println("No te lo tomes enserio");
            } else {
                System.out.println("Meh");
            }
        }
    }

    private static boolean detectSarcasm(String message) {
        message = message.replaceAll(" ", ""); // Eliminar espacios del mensaje
        Map<Character, Integer> occurrences = new HashMap<>();

        // Contar ocurrencias de cada letra en el mensaje
        for (char c : message.toCharArray()) {
            occurrences.put(c, occurrences.getOrDefault(c, 0) + 1);
        }

        // Verificar si la cantidad de ocurrencias de cada letra es igual
        int firstOccurrence = -1;
        for (int count : occurrences.values()) {
            if (firstOccurrence == -1) {
                firstOccurrence = count;
            } else if (count != firstOccurrence) {
                return false; // No hay sarcasmo si las ocurrencias son diferentes
            }
        }

        return true; // Hay sarcasmo si todas las ocurrencias son iguales
    }
}
