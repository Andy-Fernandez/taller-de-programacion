package introduccion_al_juez;
import java.util.Scanner;

public class e1221 {
    public static void main(String args[]) {
        Scanner lee = new Scanner(System.in);

        int a = lee.nextInt();
        int b = lee.nextInt();

        if(a>b){
            while(a>=b){
                System.out.println(a);
                a--;
            }
        }else{
            while(a<=b){
                System.out.println(b);
                b--;
            }
        }
    }
}
