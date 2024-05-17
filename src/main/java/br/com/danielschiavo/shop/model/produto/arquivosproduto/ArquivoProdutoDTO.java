package br.com.danielschiavo.shop.model.produto.arquivosproduto;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record ArquivoProdutoDTO(
		@NotNull
		String nome,
		@NotNull
		Byte posicao) {

}
