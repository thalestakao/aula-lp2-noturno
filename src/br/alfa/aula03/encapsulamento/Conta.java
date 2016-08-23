package br.alfa.aula03.encapsulamento;

public class Conta {

	private double saldo;
	private boolean contaAberta = false;

	public Conta(double valor, boolean estadoDaConta) {
		this.saldo = valor;
		this.contaAberta = estadoDaConta;
		
	}
	
	public Conta() {
		
	}
	
	public void abrirConta(double valor) {
		if (valor >= 5) {
			this.saldo = valor;
			this.contaAberta = true;
			System.out.println("Conta aberta com sucesso.");
		} else {
			System.out.println("O valor tem que ser maior ou igual a 5 reais! Pobre!");
		}
	}

	// RF 02 - O sistema deve permitir que o cliente fa�a dep�sitos com valor
	// m�nimo
	// de R$ 100.00
	public void depositar(double valor) {
		if (this.contaAberta == true && valor >= 100) {
			this.saldo = this.saldo + valor;
		} else if (this.contaAberta == false) {
			System.out.println("� necess�rio que voc� abra uma conta antes de efeturar o dep�sito");
		} else {
			System.out.println("� necess�rio que o valor seja maior ou igual a R$ 100.00");
		}
	}

	// RF 03 - O sistema deve permitir que o cliente fa�a saques com valor
	// m�nimo de
	// R$ 5.00;
	public void sacar(double valor) {
		if (this.contaAberta == true && valor >= 5) {
			this.saldo = this.saldo - valor;
		}
	}
	
	public double getSaldo() {
		return saldo;
	}

}
