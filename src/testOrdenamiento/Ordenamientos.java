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
        System.out.println(n);
        int v[] = new int[n];
        while(lee.hasNext()) {
            for (int j = 0; j < n; j++) {
                int dato = lee.nextInt();
                //System.out.println(dato);
                v[j] = dato;
            }
        }

        //SE PROCEDE A MEDIR EL TIEMPO
        long tiempoInicio = System.nanoTime();
        burbuja(v,n);
        long tiempoFinal = System.nanoTime();

        //SE MUESTRA EL TIEMPO QUE TARDO EN ORDENAR
        System.out.println("tiempo : " + (tiempoFinal - tiempoInicio));
    }

    //TAREA:
    //Debe de mostrar el tiempo en segundos, es decir convertir los nanosegundos a segundos

    //for (int j = 0; j < n; j++) {
    //	System.out.println(v[j]);
    //}
    //System.out.println("tiempo : " + (tiempoFinal - tiempoInicio));

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
    // borbuja recursiva
    static void funcionordenar (int[] v, int n ) {
        if (n==0) {
            return;
        }else{
            for (int i = 1; i < n; i++) {
                if (v[i - 1] > v[i]) {
                    int aux = v[i - 1];
                    v[i - 1] = v[i];
                    v[i] = aux;
                }
            }
            funcionordenar(v, n-1);
        }
    }
    // SELECCION
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
    // INSERCION
    static void insercion(int v[], int n) {
        int tmp,j;
        for (int i = 1; i < n; i++) {
            tmp=v[i];
            j=i-1;
            while(v[j]>tmp && j>=0){
                v[j+1]=v[j];
                j--;
            }
            v[j+1]=tmp;
        }
    }
    // Shell sort
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
    // Quick Sort
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
    // Merge Sort
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