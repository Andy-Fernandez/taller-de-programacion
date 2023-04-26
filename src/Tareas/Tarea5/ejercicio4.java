package Tareas.Tarea5;
import java.util.Arrays;

public class ejercicio4 {
    public static void main(String[] args) {
        // En Java, puede inicializar un vector de varias formas diferentes. Aquí hay algunos ejemplos:
        // Inicialización directa:
        int[] miVector0 = new int[5];
        miVector0 = inicializarVector(miVector0, 51, 100);

        // Mostrando:
        System.out.println("Vectores:");
        System.out.println("Vector 1: " + mostrarVector(miVector0));
    }

    //Funcion para motrar un vector:
    public static String mostrarVector(int[] vector) {
        String vectorString = "";
        for(int i = 0; i < vector.length; i++) {
            vectorString += vector[i] + " ";
        }
        return vectorString;
    }
    //4. Dado un vector inicializarlo con un valor en el rango p a q.
    public static int[] inicializarVector(int[] vector, int p, int q) {
        for(int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * (q - p + 1) + p);
        }
        return vector;
    }
}

