package br.com.caelum.ed.lista;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Vetor<T> implements ILista<T>{

	private Object[] dados;
	private int tamanho;
	
	public Vetor() {
		dados = new Object[100];
	}
	
	@Override
	public void adiciona(T t) {
		garantaPosicao();
		dados[tamanho] = t;
		tamanho++;
	}

	@Override
	public void adiciona(T t, int posicao) {
		garantaPosicao();
		validaPosicao(posicao);
		for(int i=tamanho;i>=posicao;i--)
			dados[i] = dados[i-1];
		dados[posicao] = t;
		tamanho++;
	}

	private void garantaPosicao() {
		if(dados.length == tamanho) {
			dados = Arrays.copyOf(dados, dados.length*2);
		}
	}

	private void validaPosicao(int posicao) {
		if(posicao>=tamanho) {
			throw new IllegalArgumentException("Posição inválida");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public T pega(int posicao) {
		validaPosicao(posicao);
		return (T) dados[posicao];
	}

	@Override
	public boolean contem(T t) {
		try {
			buscaIndice(t);
		} catch (IllegalArgumentException e) {
			return false;
		}
		return true;
	}

	private int buscaIndice(T t){
		for(int i=0;i<tamanho;i++) {
			if(dados[i].equals(t))
				return i;
		}
		throw new IllegalArgumentException();
	}

	@Override
	public void remove(T t) {
		int indice = buscaIndice(t);
		for(int i=indice;i<tamanho;i++) {
			dados[i] = dados[i+1];
		}
		tamanho--;
	}

	@Override
	public int tamanho() {
		return this.tamanho;
	}

	@Override
	public Iterator<T> iterator() {
		return new DataSetIterator<>();
	}
	
	@Override
	public int index(T t) {
		return buscaIndice(t);
	}
	
    private class DataSetIterator<E> implements Iterator<E>{
        private int position = 0;
 
        public boolean hasNext() {
        	return position < tamanho;
        }
 
        @SuppressWarnings("unchecked")
		public E next() {
            if (this.hasNext())
                return (E) dados[position++];
            else
            	throw new NoSuchElementException();
        }
 
        @Override
        public void remove() { 
        	//Nao faz nada
        }
    }
}
