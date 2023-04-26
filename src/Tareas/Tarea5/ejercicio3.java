package Tareas.Tarea5;
import java.util.Arrays;
import java.lang.reflect.Array;

public class ejercicio3 {
    public static void main(String[] args) {
        // Ejemplo de uso
        Integer[] miVector = new Integer[5];
        inicializarVector(miVector, 3);
        System.out.println(mostrarVector(miVector));
        // Con String
        String[] miVector3 = new String[5];
        inicializarVector(miVector3, "Hola");
        System.out.println(mostrarVector(miVector3));
        // Con boolean
        Boolean[] miVector4 = new Boolean[5];
        inicializarVector(miVector4, true);
        System.out.println(mostrarVector(miVector4));
    }

    //3. Dado un vector, inicializarlo con un valor de acuerdo al tipo del vector.
    // Función genérica para inicializar un vector con un valor predeterminado según su tipo
    public static <T> void inicializarVector(T[] vector, T valorInicial) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = valorInicial;
        }
    }

    // Función para mostrar un vector
    public static String mostrarVector(Object vector) {
        StringBuilder vectorString = new StringBuilder();
        int longitud = Array.getLength(vector);
        for (int i = 0; i < longitud; i++) {
            vectorString.append(Array.get(vector, i)).append(" ");
        }
        return vectorString.toString();
    }

}

