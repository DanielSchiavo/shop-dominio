package br.com.danielschiavo.shop.model.pedido.pagamento;

import br.com.danielschiavo.shop.model.cliente.cartao.TipoCartao;

public record CriarCartaoPedidoDTO(
			TipoCartao tipoCartao,
			String numeroDeParcelas,
			String numeroCartao
		) {

}
