package br.alfa.aula04.construtores;

public class Funcionario {
	private String nome;
	private String cpf;
	private String RG;
	private double salario;
	
	public Funcionario() {
		
	}
	
	public Funcionario(double salario) {
		this.salario = salario;
	}
	
	
	
	public Funcionario(String nome, String cpf, String rG) {
		this.nome = nome;
		this.cpf = cpf;
		this.RG = rG;
	}
		

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	

}
