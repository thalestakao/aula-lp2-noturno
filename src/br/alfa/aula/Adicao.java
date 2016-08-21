package br.alfa.aula;
import java.util.Scanner;

public class Adicao {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Informe o valor de A:");
		a = leia.nextInt();
		
		System.out.println("Informe o valor de B:");
		b = leia.nextInt();
		
		c = a + b;
		
		System.out.println("O valor de C é: " + c);
	}

}
