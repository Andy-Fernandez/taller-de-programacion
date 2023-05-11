package ContestNro4;

import java.util.Stack;
import java.util.Scanner;

public class Main1107 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            String operations = in.next();
            Stack<Integer> stack = new Stack<>();

            for (char c : operations.toCharArray()) {
                if (Character.isDigit(c)) {
                    stack.push(c - '0');  // Convertir el carácter a un número y ponerlo en la pila
                } else if (c == '+') {
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(a + b);  // Realizar la suma y poner el resultado en la pila
                } else if (c == '*') {
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(a * b);  // Realizar la multiplicación y poner el resultado en la pila
                }
            }
            System.out.println(stack.pop());  // Imprimir el elemento de la cima de la pila
        }
    }
}