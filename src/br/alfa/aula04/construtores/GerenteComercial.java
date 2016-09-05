package br.alfa.aula04.construtores;

public class GerenteComercial extends Comercial {
	
	@Override
	public double getBonificacao() {
		return super.getBonificacao() + 1000;
	}

}
