package br.com.danielschiavo.shop.model.cliente.carrinho;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Builder;

@Builder
@JsonInclude(value = Include.NON_NULL)
public record RemoverProdutoDoCarrinhoDTO(
			Long produtoId,
			String erro,
			String mensagem
		) {

}
