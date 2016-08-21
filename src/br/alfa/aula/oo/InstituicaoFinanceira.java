package br.alfa.aula.oo;

public class InstituicaoFinanceira {
	
	void mostrarSaldo(Pessoa p) {
		System.out.println("Saldo: " + p.contaBancaria.saldo);
	}
	
	void sacar(Pessoa p, double valor) {
		if(p.contaBancaria.saldo > valor) {
			p.contaBancaria.saldo = p.contaBancaria.saldo - valor;
		} else {
			System.out.println("O valor do seu saldo é insuficiente! POBRE!");
		}
	}

}
