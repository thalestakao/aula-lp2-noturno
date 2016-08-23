package br.alfa.aula03.encapsulamento;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int op;
		Conta conta = new Conta();
		double valor;
		
		while(true) {
			System.out.println("Informe uma das opções abaixo:");
			System.out.println("1 - Abrir conta");
			System.out.println("2 - Depositar");
			System.out.println("3 - Sacar");
			System.out.println("4 - Imprimir Saldo");
			System.out.println("Informe qualquer outro valor p/ Sair");
			op = leia.nextInt();
			if(op == 1) {
				System.out.println("Informe um valor inicial para que a conta seja aberta.");
				valor = leia.nextDouble();
				conta.abrirConta(valor);
			} else if(op == 2) {
				System.out.println("Informe o valor a ser depositado.");
				valor = leia.nextDouble();
				conta.depositar(valor);
			} else if(op == 3) {
				System.out.println("Informe o valor a ser sacado.");
				valor = leia.nextDouble();
				conta.sacar(valor);
			} else if (op == 4) {
				System.out.println("Saldo: " + conta.getSaldo());
			} else {
				break;
			}
			
		}
	}

}
