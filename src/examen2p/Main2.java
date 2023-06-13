package examen2p;

import java.util.*;

public class Main2 {

    static void voltear(int[] v, int m) {
        int i = 0;
        while(i < m) {
            int temp = v[i];
            v[i] = v[m];
            v[m] = temp;
            i++;
            m--;
        }
    }

    static int maximo(int[] v, int tam) {
        int m = 0;
        for(int i = 0; i < tam; i++) {
            if(v[i] > v[m]) {
                m = i;
            }
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String linea = scanner.nextLine();
            String[] splitLine = linea.split(" ");

            int[] v = new int[splitLine.length];
            int[] vm = new int[splitLine.length];

            List<Integer> num = new ArrayList<>();

            for(int i = 0; i < splitLine.length; i++) {
                v[i] = Integer.parseInt(splitLine[i]);
                vm[i] = v[i];
            }

            int tam = v.length;

            while(tam > 1) {
                int n = maximo(v, tam);

                if(n != tam - 1) {
                    voltear(v, n);
                    voltear(v, tam - 1);

                    if(n != 0) {
                        num.add(v.length - n);
                    }

                    num.add(v.length - tam + 1);
                }

                tam--;
            }

            num.add(0);

            for(int i = 0; i < vm.length; i++) {
                if(i == vm.length - 1) {
                    System.out.print(vm[i]);
                } else {
                    System.out.print(vm[i] + " ");
                }
            }

            System.out.println();
            for(int i = 0; i < num.size(); i++) {
                if(i == num.size() - 1) {
                    System.out.print(num.get(i));
                } else {
                    System.out.print(num.get(i) + " ");
                }
            }

            System.out.println();
        }
    }
}
