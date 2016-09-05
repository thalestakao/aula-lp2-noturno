package br.alfa.aula04.construtores;

public class Professor extends Funcionario{
	
	public void calcularSalario(double valor, int qtdHoras) {
		double salario = valor * qtdHoras * 5.25;
		setSalario(salario);	
	}

}
