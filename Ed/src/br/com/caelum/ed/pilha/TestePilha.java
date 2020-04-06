package br.com.caelum.ed.pilha;

import br.com.caelum.ed.Peca;

public class TestePilha {

	public static void main(String[] args) {
		IPilha<Peca> pilha = new Pilha<>();
		
		Peca peca = new Peca("motor");
		pilha.insere(peca);
		pilha.remove();
		
		if(pilha.isVazia())
			System.out.println("Pilha vazia");
	}

}
