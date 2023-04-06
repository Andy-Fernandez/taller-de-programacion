package ordenamiento.selectionSort;

public class selectionSort {
	public static void main(String[] args) {
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
	       seleccion(v, 5);
	       System.out.println("Lista ordenada");
	       for (int i = 1; i < v.length; i++) {
	           System.out.println(v[i]);
	       }
  }

		static void seleccion(int v[], int n) {
      int k;
      int tmp;
			for (int i = 0; i <= n-1; i++) {
				k=i;
				tmp =v[i];
				for (int j = i+1; j <= n; j++) {
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

