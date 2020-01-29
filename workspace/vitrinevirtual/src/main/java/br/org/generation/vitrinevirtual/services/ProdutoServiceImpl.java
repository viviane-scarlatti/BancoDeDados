package br.org.generation.vitrinevirtual.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.org.generation.vitrinevirtual.dao.ProdutoRepo;
import br.org.generation.vitrinevirtual.model.Produto;

@Component
public class ProdutoServiceImpl implements IProdutoService {

	@Autowired // declaramos a interface do DAO que criamos
	private ProdutoRepo repo; // e a anotação AutoWired busca uma implementação dentro do JPA
	
	@Override
	public List<Produto> recuperarTodos() {
		// isso corresponde a um
		// select * from tblproduto inner join tbl departamento on tblproduto.depto_id = departamento.id
		return (List<Produto>)repo.findAll();
	}
	
	@Override
	public Produto recuperarPorId(int id) {
		return repo.findById(id).orElse(null);
	}
}
