package br.org.generation.vitrinevirtual.dao;

import org.springframework.data.repository.CrudRepository;

import br.org.generation.vitrinevirtual.model.Produto;

public interface ProdutoRepo extends CrudRepository<Produto, Integer> {
	// aqui podem vir outros metodos

}
