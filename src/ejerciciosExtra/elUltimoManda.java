package ejerciciosExtra;
import java.util.Scanner;

public class elUltimoManda {
    /*
    * Entrada:
    * 5
    * 2 3 3 4 3
    * Salida:
    * 3
    * Entrada:
    * 7
    * 1 3 5 7 5 3 1
    * Salida:
    * 2
    * Entrada:
    * 8
    * 2 4 6 6 8 8 8 8
    * Salida:
    * 4
    * */
    public static void main(String[] args) {

        int n;
        Scanner lee = new Scanner(System.in);
        n = lee.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=lee.nextInt();
        }
    }
    
}
