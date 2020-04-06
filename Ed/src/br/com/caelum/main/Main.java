package br.com.caelum.main;

import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.listaLigada.ListaLigada;

public class Main {

	public static void main(String[] args) {
		ListaLigada<Aluno> alunos = new ListaLigada<>();
		Aluno lucas = new Aluno("Lucas");
		Aluno bruna = new Aluno("Bruna");
		Aluno joao = new Aluno("Joao");
		Aluno maria = new Aluno("Maria");
		
		alunos.adiciona(lucas);
		alunos.adiciona(bruna);
		alunos.adiciona(joao);
		alunos.adicionaNoComeco(maria);

		alunos.remove(lucas);
		alunos.remove(bruna);
		alunos.remove(joao);
		alunos.remove(maria);

		alunos.forEach(aluno->System.out.println(aluno));
		/*
		alunos.remove(bruna);
		
		alunos.forEach(aluno->System.out.println(aluno));*/
	}
}
