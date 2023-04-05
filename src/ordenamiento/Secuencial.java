package ordenamiento;
public class Secuencial {
    public static void main(String[] arg ){
        int[] v =new int[6];
        v[1]=2;
        v[2]=7;
        v[3]=5;
        v[4]=9;
        v[5]=8;
        System.out.println(funcionbuscar(v, 5, 7));
    }
    static int funcionbuscar (int[] v, int n,int x ) {
        if (n==0) {
            return 0;
        }else{
            if (v[n]==x) {
                return n;
            }else{
                return funcionbuscar (v, n-1, x);
            }
        }
    }
}