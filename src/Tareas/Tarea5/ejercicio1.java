package Tareas.Tarea5;
import java.util.Arrays;

public class ejercicio1 {
    public static void main(String[] args) {
        // En Java, puede inicializar un vector de varias formas diferentes. Aquí hay algunos ejemplos:
        // Inicialización directa:
        int[] miVector0 = {1, 2, 3, 4, 5};

        //Inicialización mediante un bucle:
        int[] miVector1 = new int[5];
        for(int i = 0; i < miVector1.length; i++) {
            miVector1[i] = i+1;
        }
        // 3. Inicialización con un valor por defecto, en este caso 0:
        int[] miVector2 = new int[5];
        // Pero podemos llenarlo de 3 s por ejemplo:
        Arrays.fill(miVector2, 3);

        // Mostrando:
        System.out.println("Vectores:");
        System.out.println("Vector 1: " + mostrarVector(miVector0));
        System.out.println("Vector 2: " + mostrarVector(miVector1));
        System.out.println("Vector 3: " + mostrarVector(miVector2));
        System.out.println();

        // Comparando:
        System.out.println("Comparando V1 y V2, iguales:");
        System.out.println(compararVectores(miVector0, miVector1));
        System.out.println("Comparando V1 y V3, diferentes:");
        System.out.println(compararVectores(miVector0, miVector2));
    }

    //Funcion para motrar un vector:
    public static String mostrarVector(int[] vector) {
        String vectorString = "";
        for(int i = 0; i < vector.length; i++) {
            vectorString += vector[i] + " ";
        }
        return vectorString;
    }

    //Comparando 2 vectores:
    public static boolean compararVectores(int[] vector1, int[] vector2) {
        if(vector1.length != vector2.length) {
            return false;
        }
        for(int i = 0; i < vector1.length; i++) {
            if(vector1[i] != vector2[i]) {
                return false;
            }
        }
        return true;
    }
}

