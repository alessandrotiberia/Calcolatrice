package org.generation.italy;

public class Main {
	int a;
	int b;

	public void somma() {
		int somma = a + b;
		System.out.println(" La somma è: " + somma);
	}

	public void sottrazione() {
		int sottrazione = a - b;
		System.out.println("il risultato è: " + sottrazione);

	}

	public void moltiplicazione() {
		int m = a * b;
		System.out.println(" La moltiplicazione è: " + m);
	}

	public void divisione() {
		int div = a / b;
		System.out.println("il risultato della divisione è:" + div);
	}

	public static void main(String[] args) {
		Main c = new Main();
		c.a = 10;
		c.b = 2;

		c.somma();
		c.sottrazione();
		c.moltiplicazione();
		c.divisione();

	}
}