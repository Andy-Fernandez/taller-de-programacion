package testOrdenamiento.ordenamientos;

public class Shell {
  public static void sort(int [] v) {
		final int N = v.length;
		int incremento = N;
		do {
			incremento = incremento / 2;
			for (int k = 0; k < incremento; k++) {
				for (int i = incremento + k; i < N; i = i + incremento) {
					int j = i;
					while (j - incremento >= 0 && v[j] < v[j - incremento]){
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
