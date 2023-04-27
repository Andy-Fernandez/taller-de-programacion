    package Tareas.Tarea5;
    import java.lang.reflect.Array;
    import java.util.Arrays;

    public class ejercicio5 {
        public static void main(String[] args) {
            String[] miVector = {"Hola", "Mundo", "Como", "Estas", "Hoy", "Esta", "Es", "La", "Tarea", "De", "143"};
            String x = "Hola";
            System.out.println("Vector: " + mostrarVector(miVector));
            int index = buscarCadena(miVector, x);
            if (index == -1) {
                System.out.println("La cadena " + x + " no se encuentra en el vector.");
            } else {
                System.out.println("La cadena " + x + " se encuentra en el índice " + index + " del vector.");
            }
        }

        // Función para buscar una cadena en un vector
        public static int buscarCadena(String[] vector, String x) {
            int index = Arrays.asList(vector).indexOf(x);
            return index;
        }

        // Función para mostrar un vector
        public static String mostrarVector(Object vector) {
            StringBuilder vectorString = new StringBuilder();
            int longitud = Array.getLength(vector);
            for (int i = 0; i < longitud; i++) {
                vectorString.append(Array.get(vector, i)).append(" ");
            }
            return vectorString.toString();
        }

    }

