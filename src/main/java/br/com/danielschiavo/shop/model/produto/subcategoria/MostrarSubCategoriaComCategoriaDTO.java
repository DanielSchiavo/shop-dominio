package br.com.danielschiavo.shop.model.produto.subcategoria;

import br.com.danielschiavo.shop.model.produto.categoria.MostrarCategoriaDTO;

public record MostrarSubCategoriaComCategoriaDTO(
			Long id,
			String nome,
			MostrarCategoriaDTO categoria
		) {
}
