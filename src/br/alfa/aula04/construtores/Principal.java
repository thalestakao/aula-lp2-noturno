package br.alfa.aula04.construtores;

import java.util.Scanner;

import javax.print.StreamPrintService;

public class Principal {

	public static void main(String[] args) {
		
		Funcionario[] funcionarios = new Funcionario[100];
		Scanner leia = new Scanner(System.in);
		int op;
		int i = 0;
		
		while(true) {
			System.out.println("Escolha uma das opções abaixo:");
			System.out.println("1 - Adicionar Gerente");
			System.out.println("2 - Adiconar Vendedor");
			System.out.println("3 - Adicionar Professor");
			System.out.println("4 - Sair");
			op = leia.nextInt();
			if(op == 1) {
				GerenteComercial gerente = new GerenteComercial();
				System.out.println("Informe o nome do Gerente");
				gerente.setNome(leia.next());
				System.out.println("Informe o CPF");
				gerente.setCpf(leia.next());
				System.out.println("Informe o RG");
				gerente.setRG(leia.next());
				System.out.println("Informe o salario");
				gerente.setSalario(leia.nextDouble());
				gerente.atualizaSalario();
				funcionarios[i] = gerente;
			} else if(op == 2) {
				Comercial vendedor = new Comercial();
				System.out.println("Informe o nome do Vendedor");
				vendedor.setNome(leia.next());
				System.out.println("Informe o CPF");
				vendedor.setCpf(leia.next());
				System.out.println("Informe o RG");
				vendedor.setRG(leia.next());
				System.out.println("Informe o salario");
				vendedor.setSalario(leia.nextDouble());
				vendedor.atualizaSalario();
				funcionarios[i] = vendedor;
			} else if(op == 3) {
				Professor professor = new Professor();
				System.out.println("Informe o nome do Professor");
				professor.setNome(leia.next());
				System.out.println("Informe o CPF");
				professor.setCpf(leia.next());
				System.out.println("Informe o RG");
				professor.setRG(leia.next());
				System.out.println("Informe o valor da hora aula:");
				double valor = leia.nextDouble();
				System.out.println("Informe a quantidade de horas semanais:");
				int qtd = leia.nextInt();
				professor.calcularSalario(valor, qtd);
				funcionarios[i] = professor;
			} else {
				break;
			}
			i++;
		}
		int j = 0;
		while(j<i) {
			GerenteComercial aux = (GerenteComercial) funcionarios[j];
			System.out.println("Nome: " + funcionarios[j].getNome());
			System.out.println("CPF: " + funcionarios[j].getCpf());
			System.out.println("RG: " + funcionarios[j].getRG());
			System.out.println("Salário: " + funcionarios[j].getSalario());
			System.out.println("Bonificação:" + aux.getBonificacao());
			System.out.println("========================================");
			j++;
		}
		
/*
		Funcionario func = new Funcionario();
		Funcionario func2 = new Funcionario(2000.00);

		Comercial comercial = new Comercial();
		comercial.setNome("José do Comercial");
		comercial.setSalario(800);
		
		System.out.println("Comercial: " + comercial.getBonificacao());
		comercial.atualizaSalario();
		System.out.println("Comercial: " + comercial.getSalario());
		
		
		
		GerenteComercial gerenteComercial = new GerenteComercial();
		gerenteComercial.setSalario(800);
		
		System.out.println("GC: " + gerenteComercial.getBonificacao());
		gerenteComercial.atualizaSalario();
		System.out.println("GC: " + gerenteComercial.getSalario());
		
		
		Professor professor = new Professor();
		
		professor.calcularSalario(10, 40);
		System.out.println("Professor:" + professor.getSalario());
*/		
	}
}

