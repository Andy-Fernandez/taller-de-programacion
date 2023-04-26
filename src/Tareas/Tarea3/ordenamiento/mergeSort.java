package ordenamiento;

/*
    Merge Sort
• Se basa en la técnica Divide y Vencerás
• Se divide la lista original en dos sublistas
• Ordena cas sublista de forma independiente
• Luego se combina ambos resultados
• En el mejor de los casos será O(n) si la lista estuviera casi
ordenado
• Complejidad algorítmica O(n log n) y su T(n) = kn + 2T(n/2)
 */

public class mergeSort {
    public static void main(String[] arg ){
        int[] v =new int[6];
        v[1]=9;
        v[2]=7;
        v[3]=5;
        v[4]=2;
        v[5]=8;
        System.out.println("Lista desordenada");
        for (int i = 1; i < v.length; i++) {
            System.out.println(v[i]);
        }
        ordenMerge(v);
        System.out.println("Lista ordenada");
        for (int i = 1; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }
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
