package ordenamiento.bubbleSort;

public class borbuja {
    public static void main(String[] arg ){
        int[] v =new int[6];
        v[1]=9;
        v[2]=7;
        v[3]=5;
        v[4]=2;
        v[5]=8;
        System.out.println("Lista desordenada");
        String s = "";
        for (int i = 1; i < v.length; i++) {
            s += v[i] + " ";
        }
        System.out.println(s);
        funcionordenar(v, 5);
        System.out.println("Lista ordenada");
        s = "";
        for (int i = 1; i < v.length; i++) {
            s += v[i] + " ";
        }
        System.out.println(s);
    }
    static void funcionordenar (int[] v, int n ) {
        if (n==0) {
            return;
        }else{
            for (int i = 1; i < n; i++) {
                if (v[i]>v[i+1]) {
                    int aux=v[i];
                    v[i]=v[i+1];
                    v[i+1]=aux;
                }
            }
            funcionordenar(v, n-1);
        }
    }
}


