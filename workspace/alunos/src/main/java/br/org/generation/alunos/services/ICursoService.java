package br.org.generation.alunos.services;


import br.org.generation.alunos.model.Curso;

import java.util.List;

public interface ICursoService {
	
	public void adicionarNovoCurso(Curso curso);
	public Curso recuperarDetalhes(int id);
	public List<Curso> recuperarTodos();

}
