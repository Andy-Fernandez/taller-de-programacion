package Tareas.Tarea10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class VecinosListaAdy {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("A = 1\nB = 2\nC = 3\nD = 4\nE = 5\nF = 6\nG = 7\nH = 8\nI = 9\nJ = 10");
		Scanner lee = new Scanner(new File("datos.txt"));
		int casos = lee.nextInt();
		while(casos-- >0) {
			int nodos = lee.nextInt();
			Vector<Vector<Integer>> grafo = new Vector<Vector<Integer>>();
			lee.nextLine();
			for (int i = 0; i < nodos ; i++) {
				String[] v = lee.nextLine().split(" ");
				Vector<Integer> vecinos = new Vector<Integer>();
				for (int j = 0; j < v.length; j++) {
					vecinos.add(Integer.parseInt(v[j]));
				}
				grafo.add(vecinos);
			}
			System.out.println(grafo);
		}
	}
}
