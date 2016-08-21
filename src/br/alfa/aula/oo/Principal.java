package br.alfa.aula.oo;

public class Principal {

	public static void main(String[] args) {
		Pessoa david;
		david = new Pessoa();
		
		Convocacao conv = new Convocacao();
		
		Conta contaDoDavid = new Conta();
		
		InstituicaoFinanceira bradesco = new InstituicaoFinanceira();

		david.nome = "David B.";
		david.idade = 20;
		david.corDosOlhos = "claros";
		david.genero = 'm';
		david.peso = 70;
		david.altura = 1.76;
		
		contaDoDavid.agencia = "123-2";
		contaDoDavid.Banco = "Bradesco";
		contaDoDavid.conta = "12877-5";
		contaDoDavid.saldo = 10000.00;
		
		david.contaBancaria = contaDoDavid;
		
		bradesco.mostrarSaldo(david);
		bradesco.sacar(david, 500.00);
		bradesco.mostrarSaldo(david);
		
		
		
//		System.out.println("Nome: " + david.nome);
//		System.out.println("Idade: " + david.idade);
//		System.out.println("Genero: " + david.genero + "\nPeso:" + david.peso);
		
//		david.dialogar();
	}

}
