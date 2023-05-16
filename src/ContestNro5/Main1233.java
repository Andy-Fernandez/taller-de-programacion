package ContestNro5;
import java.util.*;

public class Main1233 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack;
        int n = scanner.nextInt(); // Número de comandos
        String string;
        for (int i = 0; i < n; i++) {
            stack = new Stack<>();
            string = scanner.nextLine();
            String message = "Yes";
            if (string.length() == 0) {
                string = scanner.nextLine();
            }
            for( int j = 0; j < string.length(); j++){
                if (string.charAt(j) == '(' || string.charAt(j) == '[') {
                    stack.push(string.charAt(j));
                } else if (string.charAt(j) == ')') {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        message = "No";
                        break;
                    }
                } else if (string.charAt(j) == ']') {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        message = "No";
                        break;
                    }
                }
            }
            if(!stack.isEmpty()){
                message = "No";
            }
            System.out.println(string + " " +  message);
        }
    }
}
