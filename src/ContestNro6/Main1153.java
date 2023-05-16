package ContestNro6;

import java.util.*;

public class Main1153 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> stack = new ArrayDeque<>();
        StringBuilder name = new StringBuilder();

        while (scanner.hasNext()) {
            String input = scanner.next();
            for (char c : input.toCharArray()) {
                if (Character.isDigit(c)) {
                    stack.push(Character.getNumericValue(c));
                } else if (c == '+' || c == '*') {
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(c == '+' ? a + b : a * b);
                } else {
                    name.append(c);
                }
            }
            System.out.println(new StringBuilder(name).reverse() + ": habilidad " + stack.pop());
            stack.clear();
            name.setLength(0);  // clear the name
        }
        scanner.close();
    }
}
