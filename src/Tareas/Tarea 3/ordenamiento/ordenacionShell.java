package ordenamiento;
/*  SHELL SORT
Se basa en el algoritmos de inserción
        • Divide la lista original en sublistas, las cuales se ordenan mediante
        ordenamiento por inserción
        • Las sublistas están separadas por distancias iguales a la mitad de
        la lista la cual va reduciéndose
        • Su complejidad tiende a ser O(n log n)
        • En el mejor de los casos será O(n) si la lista estuviera casi
        ordenado
*/
public class ordenacionShell {
    public static void main(String[] arg ){
        int[] v =new int[6];
        v[1]=3;
        v[2]=1;
        v[3]=5;
        v[4]=2;
        v[5]=6;
        System.out.println("Lista desordenada");
        for (int i = 1; i < v.length; i++) {
            System.out.println(v[i]);
        }
        ordenShell(v);
        System.out.println("Lista ordenada");
        for (int i = 1; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }
    public static void ordenShell(int [] v) {
        final int N = v.length;
        int incremento = N;
        do {
            incremento = incremento / 2;
            for (int k = 0; k < incremento; k++) {
                for (int i = incremento + k; i < N; i = i + incremento) {
                    int j = i;
                    while (j - incremento >= 0 && v[j] < v[j - incremento]) {
                        int tmp = v[j];
                        v[j] = v[j - incremento];
                        v[j - incremento] = tmp;
                        j = j - incremento;
                    }
                }
            }
        } while (incremento > 1);
    }
}
