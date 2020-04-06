package br.com.caelum.ed;

public class Aluno {

	private String nome;
	
	public Aluno(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	@Override
	public String toString() {
		return this.nome;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(!(obj instanceof Aluno)) {
			return false;
		}
		return this.nome.equals(((Aluno) obj).getNome());
	}
	
	@Override
	public int hashCode() {
		return nome.hashCode();
	}
}
