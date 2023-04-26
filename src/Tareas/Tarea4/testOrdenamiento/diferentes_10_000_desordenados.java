package testOrdenamiento;

import testOrdenamiento.ordenamientos.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class diferentes_10_000_desordenados {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner lee = new Scanner(new File(Ordenamientos.class.getResource("datos/diferentes-10_000/datos5_Desordenados.txt").getPath()));
        System.out.println("DATOS DESORDENADOS - 10.000 DIFERENTES");
        // CARGANDO LOS DATOS
        int n = lee.nextInt();
        System.out.println("Cantidad de datos: " + n);
        int v[] = new int[n];
        while(lee.hasNext()) {
            for (int j = 0; j < n; j++) {
                int dato = lee.nextInt();
                v[j] = dato;
            }
        }

        int[] v1 = v.clone();
        int[] v2 = v.clone();
        int[] v3 = v.clone();
        int[] v4 = v.clone();
        int[] v5 = v.clone();
        int[] v6 = v.clone();

        // SE PROCEDE A MEDIR EL TIEMPO
        System.out.println("Burbuja: ");
        long tiempoInicio = System.nanoTime();
        Burbuja.sort(v1, n);
        long tiempoFinal = System.nanoTime();
        double tiempoSegundos = (double) (tiempoFinal - tiempoInicio) / 1_000_000_000.0;
        // Se muestra el tiempo que tardó en ordenar
        System.out.println("tiempo : " + tiempoSegundos + " segundos");

        System.out.println("Seleccion: ");
        tiempoInicio = System.nanoTime();
        Seleccion.sort(v2, n);
        tiempoFinal = System.nanoTime();
        tiempoSegundos = (double) (tiempoFinal - tiempoInicio) / 1_000_000_000.0;
        // Se muestra el tiempo que tardó en ordenar
        System.out.println("tiempo : " + tiempoSegundos + " segundos");

        System.out.println("Insercion: ");
        tiempoInicio = System.nanoTime();
        Insercion.sort(v3, n);
        tiempoFinal = System.nanoTime();
        tiempoSegundos = (double) (tiempoFinal - tiempoInicio) / 1_000_000_000.0;
        // Se muestra el tiempo que tardó en ordenar
        System.out.println("tiempo : " + tiempoSegundos + " segundos");

        System.out.println("Shell: ");
        tiempoInicio = System.nanoTime();
        Shell.sort(v4);
        tiempoFinal = System.nanoTime();
        tiempoSegundos = (double) (tiempoFinal - tiempoInicio) / 1_000_000_000.0;
        // Se muestra el tiempo que tardó en ordenar
        System.out.println("tiempo : " + tiempoSegundos + " segundos");

        System.out.println("Merge: ");
        tiempoInicio = System.nanoTime();
        Merge.sort(v5);
        tiempoFinal = System.nanoTime();
        tiempoSegundos = (double) (tiempoFinal - tiempoInicio) / 1_000_000_000.0;
        // Se muestra el tiempo que tardó en ordenar
        System.out.println("tiempo : " + tiempoSegundos + " segundos");

        System.out.println("Quick: ");
        tiempoInicio = System.nanoTime();
        QuickSort.sort(v6, 0, n - 1);
        tiempoFinal = System.nanoTime();
        tiempoSegundos = (double) (tiempoFinal - tiempoInicio) / 1_000_000_000.0;
        // Se muestra el tiempo que tardó en ordenar
        System.out.println("tiempo : " + tiempoSegundos + " segundos");
    }
}
