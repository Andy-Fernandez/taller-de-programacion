package Tareas.Tarea6;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        // Clase ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Elemento 1");
        arrayList.add("Elemento 2");
        arrayList.add("Elemento 3");
        System.out.println("ArrayList: " + arrayList);

        // Clase LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Elemento 1");
        linkedList.add("Elemento 2");
        linkedList.add("Elemento 3");
        System.out.println("LinkedList: " + linkedList);

        // Clase Vector
        Vector<String> vector = new Vector<>();
        vector.add("Elemento 1");
        vector.add("Elemento 2");
        vector.add("Elemento 3");
        System.out.println("Vector: " + vector);
    }
}