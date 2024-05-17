package br.com.danielschiavo.shop.model.cliente.cartao;

import lombok.Builder;

@Builder
public record MostrarCartaoDTO(
			Long id,
			String nomeBanco,
			String numeroCartao,
			String nomeNoCartao,
			TipoCartao tipoCartao,
			Boolean cartaoPadrao
		) {
}
