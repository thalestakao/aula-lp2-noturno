package br.alfa.aula03.metodos;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int x = 0, y = 0, z = 0, op=0;
		Calculadora calc = new Calculadora();
		Scanner leia = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("Escolha uma das opções abaixo:");
			System.out.println("1 - SOMAR");
			System.out.println("2 - SUBTRAIR");
			System.out.println("3 - MULTIPLICAR");
			System.out.println("4 - DIVIDIR");
			op = leia.nextInt();
			if (op >= 1 && op <= 4) {
				System.out.println("Informe o valor de A:");
				x = leia.nextInt();
				System.out.println("Informe o valor de B:");
				y = leia.nextInt();
			}
			if (op == 1) {
				z = calc.somar(x, y);
			} else if (op == 2) {
				z = calc.subtrair(x, y);
			} else if (op == 3) {
				z = calc.multiplicar(x, y);
			} else if (op == 4) {
				z = calc.dividir(x, y);
			} else {
				System.out.println("FINALIZANDO...");
				flag = false;
				
			}
			if (op >= 1 && op <= 4) {
				System.out.println("RESULTADO: " + z);
			}
		}
		leia.close();

	}

}
