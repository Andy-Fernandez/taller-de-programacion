package Tareas.Tarea5;
import java.util.Arrays;

public class ejercicio2 {
    public static void main(String[] args) {
        // En Java, puede inicializar un vector de varias formas diferentes. Aquí hay algunos ejemplos:
        // Inicialización directa:
        int[] miVector0 = {1, 2, 3, 4, 5};

        //Inicialización mediante un bucle:
        int[] miVector1 = new int[5];


        // Mostrando:
        System.out.println("Vectores:");
        System.out.println("Vector 1: " + mostrarVector(miVector0));
        System.out.println("Vector 2: " + mostrarVector(miVector1));
        System.out.println();

        // Comparando:
        System.out.println("Copiando V1 a V2:");
        copiarVector(miVector0, miVector1);
        System.out.println("Vector 1: " + mostrarVector(miVector0));
        System.out.println("Vector 2: " + mostrarVector(miVector1));
        System.out.println();
        System.out.println("Copiando V1 a V3, siendo V3 un nuevo vector:");
        int[] miVector2 = copiarVector(miVector0);
        System.out.println("Vector 1: " + mostrarVector(miVector0));
        System.out.println("Vector 3: " + mostrarVector(miVector2));

    }

    //Funcion para motrar un vector:
    public static String mostrarVector(int[] vector) {
        String vectorString = "";
        for(int i = 0; i < vector.length; i++) {
            vectorString += vector[i] + " ";
        }
        return vectorString;
    }

    //Copiar datos de un vector a otro:
    //1. Copiar un vector a otro devolviendo un vector nuevo tipo int[]:
    public static int[] copiarVector(int[] vector) {
        int[] vectorCopia = new int[vector.length];
        for(int i = 0; i < vector.length; i++) {
            vectorCopia[i] = vector[i];
        }
        return vectorCopia;
    }
    //2. Copiar un vector a otr pasando los dos vectores como parametros:
    public static void copiarVector(int[] vector1, int[] vector2) {
        for(int i = 0; i < vector1.length; i++) {
            vector2[i] = vector1[i];
        }
    }

}

