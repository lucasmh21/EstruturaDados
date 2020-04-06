package br.com.caelum.ed.listaLigada;

import br.com.caelum.ed.lista.ILista;

public interface IListaLigada<T> extends ILista<T>{

	public void adicionaNoComeco(T t);
	public void removeNoInicio();
	public void removeNoFim();
}
