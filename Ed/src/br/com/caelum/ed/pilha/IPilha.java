package br.com.caelum.ed.pilha;

public interface IPilha<T> {
	public void insere(T t);
	public T remove();
	public boolean isVazia();
}
