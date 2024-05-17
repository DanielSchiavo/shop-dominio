package br.com.danielschiavo.shop.model.produto.dto;

import java.math.BigDecimal;
import java.util.Set;

import br.com.danielschiavo.shop.model.pedido.TipoEntrega;
import br.com.danielschiavo.shop.model.produto.arquivosproduto.ArquivoProdutoDTO;
import lombok.Builder;

@Builder
public record AlterarProdutoDTO(
		String nome,
		String descricao,
		BigDecimal preco,
		Integer quantidade,
		Boolean ativo,
		Long subCategoriaId,
		Set<TipoEntrega> tiposEntrega,
		Set<ArquivoProdutoDTO> arquivos
		) {

}
