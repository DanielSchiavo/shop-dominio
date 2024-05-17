package br.com.danielschiavo.shop.model.produto.dto;

import java.math.BigDecimal;
import java.util.Set;

import br.com.danielschiavo.shop.model.pedido.TipoEntrega;
import br.com.danielschiavo.shop.model.produto.arquivosproduto.ArquivoProdutoDTO;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Builder;

@Builder
public record CadastrarProdutoDTO (
		@NotBlank
		String nome,
		@NotBlank
		String descricao,
		@NotNull
		@Positive
		BigDecimal preco,
		@NotNull
		Integer quantidade,
		@NotNull
		Boolean ativo,
		@NotNull
		Long subCategoriaId,
		@NotNull
		Set<TipoEntrega> tiposEntrega,
		@NotNull
		Set<ArquivoProdutoDTO> arquivos
		) {	


}
