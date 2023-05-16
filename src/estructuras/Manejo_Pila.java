package estructuras;

import java.util.Stack;
public class Manejo_Pila {
    public static void main(String[] args) {
        Stack<String> miPila = new Stack<>();

        miPila.push("alan");
        miPila.push("rosa");
        miPila.push("carmen");
        miPila.push("felipe");
        miPila.push("adrian");

        System.out.println(miPila);

        //sacamos 2 nombres de la cima de miPila
        miPila.pop();
        miPila.pop();

        System.out.println(miPila);

        String nombre = miPila.peek();
        System.out.println(nombre);

        boolean vacio = miPila.empty();
        System.out.println(vacio);
    }
}
