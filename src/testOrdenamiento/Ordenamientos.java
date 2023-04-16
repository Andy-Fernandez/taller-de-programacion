package testOrdenamiento;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ordenamientos {

    public static void main(String[] args) throws FileNotFoundException {
        // TODO Auto-generated method stub
        Scanner lee = new Scanner(new File(Ordenamientos.class.getResource("datos.txt").getPath()));
        //CARGANDO LOS DATOS
        int n = lee.nextInt();
        System.out.println("Cantidad de datos: " + n);
        int v[] = new int[n];
        while(lee.hasNext()) {
            for (int j = 0; j < n; j++) {
                int dato = lee.nextInt();
                //System.out.println(dato);
                v[j] = dato;
            }
        }

        int[] v1 = v.clone();
        int[] v2 = v.clone();
        int[] v3 = v.clone();
        int[] v4 = v.clone();
        int[] v5 = v.clone();
        int[] v6 = v.clone();

        //SE PROCEDE A MEDIR EL TIEMPO
        System.out.println("Burbuja: ");
        long tiempoInicio = System.nanoTime();
        burbuja(v1,n);
        long tiempoFinal = System.nanoTime();
        double tiempoSegundos = (double) (tiempoFinal - tiempoInicio) / 1_000_000_000.0;
        // Se muestra el tiempo que tardó en ordenar
        System.out.println("tiempo : " + tiempoSegundos + " segundos");

        System.out.println("Seleccion: ");
        tiempoInicio = System.nanoTime();
        seleccion(v2,n);
        tiempoFinal = System.nanoTime();
        tiempoSegundos = (double) (tiempoFinal - tiempoInicio) / 1_000_000_000.0;
        // Se muestra el tiempo que tardó en ordenar
        System.out.println("tiempo : " + tiempoSegundos + " segundos");

        System.out.println("Insercion: ");
        tiempoInicio = System.nanoTime();
        insercion(v3,n);
        tiempoFinal = System.nanoTime();
        tiempoSegundos = (double) (tiempoFinal - tiempoInicio) / 1_000_000_000.0;
        // Se muestra el tiempo que tardó en ordenar
        System.out.println("tiempo : " + tiempoSegundos + " segundos");

        System.out.println("Shell: ");
        tiempoInicio = System.nanoTime();
        ordenShell(v4);
        tiempoFinal = System.nanoTime();
        tiempoSegundos = (double) (tiempoFinal - tiempoInicio) / 1_000_000_000.0;
        // Se muestra el tiempo que tardó en ordenar
        System.out.println("tiempo : " + tiempoSegundos + " segundos");

        System.out.println("Merge: ");
        tiempoInicio = System.nanoTime();
        ordenMerge(v5);
        tiempoFinal = System.nanoTime();
        tiempoSegundos = (double) (tiempoFinal - tiempoInicio) / 1_000_000_000.0;
        // Se muestra el tiempo que tardó en ordenar
        System.out.println("tiempo : " + tiempoSegundos + " segundos");

        System.out.println("Quick: ");
        tiempoInicio = System.nanoTime();
        quickSort(v6,0,n-1);
        tiempoFinal = System.nanoTime();
        tiempoSegundos = (double) (tiempoFinal - tiempoInicio) / 1_000_000_000.0;
        // Se muestra el tiempo que tardó en ordenar
        System.out.println("tiempo : " + tiempoSegundos + " segundos");
    }

    // 1) BURBUJA
    static void burbuja(int[] v, int n) {
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(v[j] < v[i]) {
                    int aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }
            }
        }
    }
    // 2) SELECCION
    static void seleccion(int v[], int n) {
        int k;
        int tmp;
        for (int i = 0; i <= n-1; i++) {
            k=i;
            tmp =v[i];
            for (int j = i+1; j < n; j++) {
                if(v[j]<tmp) {
                    tmp=v[j];
                    k=j;
                }
            }
            v[k]=v[i];
            v[i]=tmp;
        }
    }
    //3) INSERCION
    static void insercion(int v[], int n) {
        int tmp,j;
        for (int i = 1; i < n; i++) {
            tmp=v[i];
            j=i-1;
            while (j >= 0 && v[j] > tmp) {
                v[j + 1] = v[j];
                j--;
            }
            v[j+1]=tmp;
        }
    }
    //4) Shell sort
    public static void ordenShell(int [] v) {
        final int N = v.length;
        int incremento = N;
        do {
            incremento = incremento / 2;
            for (int k = 0; k < incremento; k++) {
                for (int i = incremento + k; i < N; i = i + incremento) {
                    int j = i;
                    while (j - incremento >= 0 && v[j] < v[j - incremento]){
                        int tmp = v[j];
                        v[j] = v[j - incremento];
                        v[j - incremento] = tmp;
                        j = j - incremento;
                    }
                }
            }
        } while (incremento > 1);
    }
    //5) Quick Sort
    public static void quickSort(int[] v, int inicio, int fin) {
        if(inicio>=fin)return;
        int pivote=v[inicio];
        int izq=inicio+1;
        int der=fin;
        while(izq<=der) {
            while(izq<=fin && v[izq]<pivote)izq++;
            while(der>inicio && v[der]>=pivote)der--;
            if(izq<der) {
                int tmp =v[izq];
                v[izq]=v[der];
                v[der]=tmp;
            }
        }
        if(der>inicio) {
            int tmp =v[inicio];
            v[inicio]=v[der];
            v[der]=tmp;
        }
        quickSort(v, inicio, der-1);
        quickSort(v, der+1, fin);
    }
    //6) Merge Sort
    public static void ordenMerge(int [] v) {
        int n = v.length;
        if (n <= 1) {
            return;
        }
        int mitad = n / 2;
        int[] izq = new int[mitad];
        int[] der = new int[n - mitad];
        for (int i = 0; i < mitad; i++) {
            izq[i] = v[i];
        }
        for (int i = mitad; i < n; i++) {
            der[i - mitad] = v[i];
        }
        ordenMerge(izq);
        ordenMerge(der);
        combinar(v, izq, der, mitad, n - mitad);
    }
    public static void combinar(int[] v, int[] izq, int[] der, int izqTam, int derTam) {
        int i = 0, j = 0, k = 0;
        while (i < izqTam && j < derTam) {
            if (izq[i] <= der[j]) {
                v[k++] = izq[i++];
            } else {
                v[k++] = der[j++];
            }
        }
        while (i < izqTam) {
            v[k++] = izq[i++];
        }
        while (j < derTam) {
            v[k++] = der[j++];
        }
    }

}
