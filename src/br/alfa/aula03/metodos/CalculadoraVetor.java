package br.alfa.aula03.metodos;

public class CalculadoraVetor {

	int[] somar(int[] a, int[] b) {
		if (a.length == b.length) {
			int[] c = new int[a.length];
			for (int i = 0; i < c.length; i++) {
				c[i] = a[i] + b[i];
			}
			return c;
		}
		return null;
	}

	int[] subtrair(int[] a, int[] b) {
		if (a.length == b.length) {
			int[] c = new int[a.length];
			for (int i = 0; i < c.length; i++) {
				c[i] = a[i] - b[i];
			}
			return c;
		}
		return null;
	}

	int[] multiplicar(int[] a, int b) {
		int[] c = new int[a.length];
		for (int i = 0; i < c.length; i++) {
			c[i] = a[i] * b;
		}
		return c;
	}

	int[] dividir(int[] a, int b) {
		int[] c = new int[a.length];
		for (int i = 0; i < c.length; i++) {
			c[i] = a[i] * b;
		}
		return c;
	}

}
