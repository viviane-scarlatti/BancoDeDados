package br.org.generation.alunos.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import br.org.generation.alunos.model.Aluno;
import br.org.generation.alunos.services.IAlunoService;


@RestController
@CrossOrigin("*")
public class AlunoController {
	
	@Autowired
	private IAlunoService servico; // delcaramos sempre a interface
	
	
	@PostMapping("/aluno/novo")
	public ResponseEntity<Aluno> inserirAluno(@RequestBody Aluno aluno) {
		servico.novoAluno(aluno);
		return ResponseEntity.ok(aluno);
	}
	
	@GetMapping("/aluno")
	public ResponseEntity<List<Aluno>> mostrarTodos() {
		return ResponseEntity.ok(servico.recuperarTodos());
	}
	
	@GetMapping("/aluno/{id}")
	public ResponseEntity<Aluno> mostrarPeloId(@PathVariable int id) {
		Aluno p = servico.recuperarPorId(id);
		if (p != null) {
			return ResponseEntity.ok(p);
		}
		return ResponseEntity.notFound().build();
	}

}
