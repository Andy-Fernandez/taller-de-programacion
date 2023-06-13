package examen2p;

import java.util.*;

public class Main {

    // Función para invertir los elementos en un arreglo desde el índice 0 hasta m
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

    // Función para encontrar el índice del elemento máximo en un arreglo
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
        // Preparar la lectura de la entrada estándar
        Scanner scanner = new Scanner(System.in);

        // Leer hasta el final del archivo
        while (scanner.hasNextLine()) {
            String linea = scanner.nextLine();
            // Dividir la línea en elementos separados por espacios
            String[] splitLine = linea.split(" ");

            // Crear dos arreglos: v y vm
            int[] v = new int[splitLine.length];
            int[] vm = new int[splitLine.length];

            // Crear una lista para almacenar números
            List<Integer> num = new ArrayList<>();

            // Convertir los elementos de splitLine a enteros y asignarlos a los arreglos v y vm
            for(int i = 0; i < splitLine.length; i++) {
                v[i] = Integer.parseInt(splitLine[i]);
                vm[i] = v[i];
            }

            // Obtener el tamaño del arreglo v
            int tam = v.length;

            // Realizar operaciones en el arreglo v hasta que su tamaño sea 1
            while(tam > 1) {
                // Encontrar el índice del máximo elemento en el arreglo v
                int n = maximo(v, tam);

                // Si el máximo elemento no está en la última posición, invertir los elementos
                if(n != tam - 1) {
                    voltear(v, n);
                    voltear(v, tam - 1);

                    // Si el máximo elemento no está en la primera posición, agregar v.length - n a la lista num
                    if(n != 0) {
                        num.add(v.length - n);
                    }

                    // Agregar v.length - tam + 1 a la lista num
                    num.add(v.length - tam + 1);
                }

                // Reducir el tamaño del arreglo v
                tam--;
            }

            // Agregar 0 al final de la lista num
            num.add(0);

            // Imprimir los elementos del arreglo vm separados por espacios
            for(int i = 0; i < vm.length; i++) {
                if(i == vm.length - 1) {
                    System.out.print(vm[i]);
                } else {
                    System.out.print(vm[i] + " ");
                }
            }

            // Imprimir los elementos de la lista num separados por espacios
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