package testOrdenamiento.ordenamientos;

public class QuickSort {
  public static void sort(int[] v, int inicio, int fin) {
		if(inicio>=fin)return;
		int pivote=v[inicio];
		int izq=inicio+1;
		int der=fin;
		while(izq<=der) {
			while(izq<=fin && v[izq]<pivote)izq++;
			while(der>inicio && v[der]>=pivote)der--;
			if(izq<der) {
				int tmp =v[izq];
				v[izq]=v[der];
				v[der]=tmp;
			}
		}
		if(der>inicio) {
			int tmp =v[inicio];
			v[inicio]=v[der];
			v[der]=tmp;
		}
		sort(v, inicio, der-1);
		sort(v, der+1, fin);
	}
}
