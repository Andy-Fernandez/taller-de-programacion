package Tareas.Tarea9;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class SegundoDiccionario {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner lee = new Scanner(new File("src/Tareas/Tarea9/texto.txt"));
        TreeSet<String> set = new TreeSet<>();

        String currentWord = "";

        while (lee.hasNextLine()) {
            String line = lee.nextLine().toLowerCase();
            StringTokenizer tok = new StringTokenizer(line);
            while (tok.hasMoreTokens()) {
                String cadena = tok.nextToken();
                char car = cadena.charAt(cadena.length() - 1);
                if (car == '-' || car == '.' || car == ',') {
                    currentWord += cadena.substring(0, cadena.length() - 1);
                } else {
                    currentWord += cadena + " ";
                }
                if (car == '.' || car == ',') {
                    currentWord += " ";
                }
            }

        }
        StringTokenizer tok = new StringTokenizer(currentWord);
        while (tok.hasMoreTokens()) {
            set.add(tok.nextToken());
        }
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}