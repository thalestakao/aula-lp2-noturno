package br.alfa.aula04.construtores;

public class Comercial extends Funcionario {
	
	public double getBonificacao() {
		double bonificacao = getSalario()*0.05;
		return bonificacao;
	}
	
	public void atualizaSalario() {
		setSalario(getSalario() + getBonificacao());
	}
	
	

}
