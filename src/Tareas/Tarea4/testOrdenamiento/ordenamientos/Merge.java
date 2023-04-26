package testOrdenamiento.ordenamientos;

public class Merge {
  public static void sort(int [] v) {
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
    sort(izq);
    sort(der);
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
