package Tareas.Tarea10;

public class Main {

	public static void main(String[] args) {
		// Inciso A
		GrafoMatrizAdyacencia a = new GrafoMatrizAdyacencia(4, false);
		a.insertaArista(0, 1);
		a.insertaArista(0, 2);
		a.insertaArista(0, 3);
		a.insertaArista(1, 2);
		a.insertaArista(2,  3);
		System.out.println("INCISO A");
		a.imprimeGrafo();
		a.imprimeListaAdyacencia();

		// Inciso B
		GrafoMatrizAdyacencia b = new GrafoMatrizAdyacencia(6, true);
		b.insertaArista(2, 4);
		b.insertaArista(3, 1);
		b.insertaArista(4, 2);
		b.insertaArista(5, 3);
		b.insertaArista(5, 4);
		System.out.println("\nINCISO B");
		b.imprimeGrafo();
		b.imprimeListaAdyacencia();

		// Inciso C
		GrafoMatrizAdyacencia c = new GrafoMatrizAdyacencia(6, true);
		c.insertaArista(0, 2);
		c.insertaArista(1, 2);
		c.insertaArista(2, 3);
		c.insertaArista(3, 0);
		c.insertaArista(3, 1);
		c.insertaArista(4, 2);
		c.insertaArista(4, 3);
		c.insertaArista(5, 4);

		System.out.println("\nINCISO C");
		c.imprimeGrafo();
		c.imprimeListaAdyacencia();

		// Inciso D
		GrafoMatrizAdyacencia d = new GrafoMatrizAdyacencia(6, true);
		d.insertaArista(0, 0);
		d.insertaArista(1, 0);
		d.insertaArista(1, 2);
		d.insertaArista(1, 4);
		d.insertaArista(3, 1);
		d.insertaArista(3, 2);
		d.insertaArista(4, 5);
		d.insertaArista(5, 4);

		System.out.println("\nINCISO D");
		d.imprimeGrafo();
		d.imprimeListaAdyacencia();

		// Inciso E
		GrafoMatrizAdyacencia e = new GrafoMatrizAdyacencia(10, true);
		e.insertaArista(0, 8);
		e.insertaArista(1, 2);
		e.insertaArista(2, 0);
		e.insertaArista(2, 3);
		e.insertaArista(4, 0);
		e.insertaArista(4, 1);
		e.insertaArista(4, 6);
		e.insertaArista(5, 4);
		e.insertaArista(5, 7);
		e.insertaArista(6, 7);
		e.insertaArista(8, 3);
		e.insertaArista(8, 9);

		System.out.println("\nINCISO E");
		e.imprimeGrafo();
		e.imprimeListaAdyacencia();

		// Inciso F
		GrafoMatrizAdyacencia f = new GrafoMatrizAdyacencia(10, true);
		f.insertaArista(0, 1, 6);
		f.insertaArista(0, 6, 8);
		f.insertaArista(0, 3, 1);
		f.insertaArista(1, 2, 1);
		f.insertaArista(1, 0, 6);
		f.insertaArista(1, 4, 1);
		f.insertaArista(1, 7, 1);
		f.insertaArista(2, 1, 1);
		f.insertaArista(2, 7, 4);
		f.insertaArista(3, 4, 6);
		f.insertaArista(4, 3, 6);
		f.insertaArista(4, 1, 1);
		f.insertaArista(4, 5, 2);
		f.insertaArista(5, 6, 4);
		f.insertaArista(5, 4, 2);
		f.insertaArista(5, 8, 6);
		f.insertaArista(6, 0, 8);
		f.insertaArista(6, 5, 4);
		f.insertaArista(6, 7, 5);
		f.insertaArista(6, 8, 5);
		f.insertaArista(7, 1, 3);
		f.insertaArista(7, 2, 4);
		f.insertaArista(7, 6, 5);
		f.insertaArista(7, 8, 7);
		f.insertaArista(8, 5, 6);
		f.insertaArista(8, 6, 5);
		f.insertaArista(8, 7, 7);
		System.out.println("\nINCISO F");
		f.imprimeGrafoPeso();
		f.imprimeListaAdyacenciaPeso();
	}
}