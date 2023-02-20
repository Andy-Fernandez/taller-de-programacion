package introduccion_al_juez;
import java.util.Scanner;

public class e1900 {
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);

        //The imput is a n, a number bewteen 1 and 1000
        //The output is a fibbonacci serie but the difference is that the serie is:
        //0 0 1 1 1 1 2 2 3 3 5 5 8 8...
        //so just show the first n numbers of the serie.
        int a, b, x;
        int caseNumber = lee.nextInt();

        for (int j = 0; j < caseNumber; j++) {
            a = 0;
            b = 1;
            x = a;
            int n = lee.nextInt();
            for (int i = 1; i <= n; i++) {
                System.out.print(x + " ");
                if (i % 2 == 0) {
                    x = a + b;
                    a = b;
                    b = x;
                }
            }
        }

    }
}
