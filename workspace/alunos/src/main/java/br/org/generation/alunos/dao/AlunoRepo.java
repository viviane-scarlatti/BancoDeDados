package br.org.generation.alunos.dao;

import org.springframework.data.repository.CrudRepository;

import br.org.generation.alunos.model.Aluno;

public interface AlunoRepo extends CrudRepository<Aluno, Integer> {

}
