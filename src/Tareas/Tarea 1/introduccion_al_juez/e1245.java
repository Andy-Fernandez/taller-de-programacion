package introduccion_al_juez;
import java.util.Scanner;

public class e1245 {
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);

        int a = lee.nextInt();
        int b = lee.nextInt();
        int c = lee.nextInt();

        if (a > b && a > c) {
            if (b > c) {
                System.out.println(c + " " + b + " " + a);
            } else {
                System.out.println(b + " " + c + " " + a);
            }
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.println(c + " " + a + " " + b);
            } else {
                System.out.println(a + " " + c + " " + b);
            }
        } else if (c > a && c > b) {
            if (a > b) {
                System.out.println(b + " " + a + " " + c);
            } else {
                System.out.println(a + " " + b + " " + c);
            }
        }
        //puedes escribir otro algoritmo ya que no da si introducimos 2 1 2
        //escribe el código aquí:
        if (a == b && a == c) {
            System.out.println(a + " " + b + " " + c);
        } else if (a == b && a > c) {
            System.out.println(c + " " + a + " " + b);
        } else if (a == c && a > b) {
            System.out.println(b + " " + a + " " + c);
        } else if (b == c && b > a) {
            System.out.println(a + " " + b + " " + c);
        }
    }
}
