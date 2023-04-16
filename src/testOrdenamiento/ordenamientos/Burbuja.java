package testOrdenamiento.ordenamientos;

public class Burbuja {
  public static void sort(int[] v, int n) {
    for (int i = 0; i < n-1; i++) {
			for (int j = i+1; j < n; j++) {
				if(v[j] < v[i]) {
					int aux = v[i];
					v[i] = v[j];
					v[j] = aux;
				}
			}
		}
  }
}
