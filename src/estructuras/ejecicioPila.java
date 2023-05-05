package estructuras;
import java.util.Stack;

public class ejecicioPila {
    public static void main(String[] args) {
        String cad = "()(((((())))))";
        boolean sw = false;
        Stack<Character> miPila = new Stack<Character>();
        for(int i = 0; i < cad.length(); i++){
            if(cad.charAt(i) == '('){
                miPila.push(cad.charAt(i));
            }
            else if(cad.charAt(i) == ')'){
                if(miPila.empty()){
                    sw = true;
                    break;
                }
                else{
                    miPila.pop();
                }
            }
        }
        if(sw || !miPila.empty()){
            System.out.println("No esta balanceada");
        }
        else{
            System.out.println("Esta balanceada");
        }
    }
}
