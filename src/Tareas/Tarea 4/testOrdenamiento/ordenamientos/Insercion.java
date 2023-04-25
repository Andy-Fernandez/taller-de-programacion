package testOrdenamiento.ordenamientos;

public class Insercion {
  public static void sort(int v[], int n) {
		int tmp,j;
		for (int i = 1; i < n; i++) {
			tmp=v[i];
			j=i-1;
			while(j>=0 && v[j]>tmp ){
				v[j+1]=v[j];
				j--;
			}
			v[j+1]=tmp;
		}
	}
}
