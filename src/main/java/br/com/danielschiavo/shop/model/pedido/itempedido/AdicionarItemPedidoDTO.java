package br.com.danielschiavo.shop.model.pedido.itempedido;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record AdicionarItemPedidoDTO(
			@NotNull
			Long idProduto,
			@NotNull
			Integer quantidade
		) {

}
