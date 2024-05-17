package br.com.danielschiavo.shop.model.pedido.dto;

import java.math.BigDecimal;

import lombok.ToString;

public record ProdutoPedidoDTO(
				Long produtoId,
				String nome,
				BigDecimal preco,
				String primeiraImagem,
				Boolean ativo
		) {

}
