package br.org.generation.vitrinevirtual.services;

import java.util.List;

import br.org.generation.vitrinevirtual.model.Produto;

public interface IProdutoService {
	public List<Produto> recuperarTodos();
	public Produto recuperarPorId(int id);
	

}
