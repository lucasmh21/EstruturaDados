package br.com.caelum.ed.pilha;

import br.com.caelum.ed.listaLigada.ListaLigada;

public class Pilha<T> implements IPilha<T>{
	private ListaLigada<T> lista;
	
	public Pilha() {
		lista = new ListaLigada<>();
	}

	@Override
	public void insere(T t) {
		lista.adiciona(t);
	}

	@Override
	public T remove() {
		T pega = lista.pega(lista.tamanho() - 1);
		lista.removeNoFim();
		return pega;
	}

	@Override
	public boolean isVazia() {
		return lista.tamanho() == 0;
	}
}
