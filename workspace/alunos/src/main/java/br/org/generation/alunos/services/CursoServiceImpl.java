package br.org.generation.alunos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.org.generation.alunos.dao.CursoRepo;
import br.org.generation.alunos.model.Curso;

@Component
public class CursoServiceImpl implements ICursoService {

	@Autowired
	private CursoRepo repo;

	public void adicionarNovoCurso(Curso curso) {
		repo.save(curso);
	}

	public Curso recuperarDetalhes(int id) {
		return repo.findById(id).get();
	}

	public List<Curso> recuperarTodos() {
		return (List<Curso>) repo.findAll();
	}
}
