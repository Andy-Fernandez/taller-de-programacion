package mascaraDeB;

public class main {
    public static void main(String[] args) {
        int n = 3;
        //String []cad = ('a','b','c'); ESTO NO FUNCIONA pero es el objetivo
        String []cad = new String[(int) Math.pow(2, n)]; // este solo esta para que no de error


        for (int i = 0; i < Math.pow(2, n); i++) {
            System.out.println(cad[i]);
        }
    }
}
