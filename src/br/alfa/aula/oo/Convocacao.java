package br.alfa.aula.oo;

public class Convocacao {
	
	void alistar(Pessoa p) {
		if(p.idade >= 18) {
			System.out.println(p.nome + " foi convocado para o alistamento!");
		} else {
			System.out.println(p.nome + " n�o foi convocado para o alistamento!");
		}
	}

}
