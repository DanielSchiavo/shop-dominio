package br.com.danielschiavo.shop.model.pedido.pagamento;

import br.com.danielschiavo.shop.model.cliente.cartao.TipoCartao;

public record MostrarCartaoPedidoDTO(
		String nomeBanco,
		String numeroCartao,
		String nomeNoCartao,
		String numeroDeParcelas,
		TipoCartao tipoCartao
		) {
	
    public MostrarCartaoPedidoDTO(CartaoPedido dadosCartao) {
        this(
        		dadosCartao.getNomeBanco(),
        		dadosCartao.getNumeroCartao(),
        		dadosCartao.getNomeNoCartao(),
        		dadosCartao.getNumeroDeParcelas(),
        		dadosCartao.getTipoCartao()
        );
    }
}
