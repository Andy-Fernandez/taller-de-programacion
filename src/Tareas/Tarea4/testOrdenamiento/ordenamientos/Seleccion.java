package testOrdenamiento.ordenamientos;

public class Seleccion {
  public static void sort(int v[], int n) {
		int k;
		int tmp;
      for (int i = 0; i <= n-1; i++) {
        k=i;
        tmp =v[i];
        for (int j = i+1; j < n; j++) {
          if(v[j]<tmp) {
            tmp=v[j];
            k=j;
          }
        }
        v[k]=v[i];
        v[i]=tmp;
      }
	}
}
