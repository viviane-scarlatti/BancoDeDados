package br.org.generation.alunos.dao;

import org.springframework.data.repository.CrudRepository;

import br.org.generation.alunos.model.Curso;

public interface CursoRepo extends CrudRepository<Curso, Integer> {

}
