package Tareas.Tarea1.introduccion_al_juez;
import java.util.Scanner;

public class e1018 {
    public static void main(String args[]) {
        Scanner lee = new Scanner(System.in);

        int n = lee.nextInt();
        int i = 0;
        int a,b;
        while(i<n){
            a = lee.nextInt();
            b = lee.nextInt();
            if(a>b) System.out.println(">");
            else if (a<b) System.out.println("<");
            else System.out.println("=");
            i++;
        }
    }
}
