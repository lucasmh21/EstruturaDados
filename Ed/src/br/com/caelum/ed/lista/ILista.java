package br.com.caelum.ed.lista;

public interface ILista<T>  extends Iterable<T>{
	public void adiciona(T t);
	public void adiciona(T t, int posicao);
	public T pega(int posicao);
	public boolean contem(T t);
	public void remove(T t);
	public int tamanho();
	public int index(T t);
}
