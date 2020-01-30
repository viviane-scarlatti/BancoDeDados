package br.org.generation.alunos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.org.generation.alunos.dao.AlunoRepo;
import br.org.generation.alunos.model.Aluno;


@Component
public class AlunoServiceImpl implements IAlunoService {
	
	@Autowired
	private AlunoRepo repo;
	
	@Override
	public List<Aluno> recuperarTodos() {
		
		return (List<Aluno>)repo.findAll();
	}
	
	@Override
	public Aluno recuperarPorId(int id) {
		return repo.findById(id).get();
	}
	
	@Override
	public void novoAluno(Aluno aluno) {
	repo.save(aluno);
	}

}
