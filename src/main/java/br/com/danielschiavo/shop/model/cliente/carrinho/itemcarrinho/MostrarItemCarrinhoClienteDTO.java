package br.com.danielschiavo.shop.model.cliente.carrinho.itemcarrinho;

import java.math.BigDecimal;

import lombok.Builder;

@Builder
public record MostrarItemCarrinhoClienteDTO(
							Long produtoId,
							Integer quantidade,
							BigDecimal subTotal
		) {

}
