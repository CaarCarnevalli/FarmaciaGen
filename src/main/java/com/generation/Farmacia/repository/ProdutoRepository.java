package com.generation.Farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.Farmacia.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	static List<Produto> findAllByNomeContainingIgnoreCase(String nome) {
		List<Produto> produtos = ProdutoRepository.findAllByNomeContainingIgnoreCase(nome);
		return produtos;
	}

}
