package basics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner lee = new Scanner(new File("src/basics/input.txt"));

        while(lee.hasNext()){
            int n = lee.nextInt();
            for (int i = 0; i < n; i++) {
                int dato = lee.nextInt();
                System.out.println(dato);
            }
            System.out.println();
        }
    }
}
