    package Tareas.Tarea5;
    import java.lang.reflect.Array;

    public class ejercicio5 {
        public static void main(String[] args) {
            // Ejemplo de uso

            String[] miVector3 = {"Hola", "Mundo", "Como", "Estas", "Hoy", "Esta", "Es", "La", "Tarea", "De", "143"};
            System.out.println(mostrarVector(miVector3));
        }

        //5. Dado un vector de cadenas, buscar la cadena x.


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

