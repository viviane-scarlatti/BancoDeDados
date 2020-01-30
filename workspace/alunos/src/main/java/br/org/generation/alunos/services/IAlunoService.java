package br.org.generation.alunos.services;

import java.util.List;

import br.org.generation.alunos.model.Aluno;


public interface IAlunoService {
	public List<Aluno> recuperarTodos();
	public Aluno recuperarPorId(int id);
	public void novoAluno(Aluno aluno);
}
