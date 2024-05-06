package br.com.danielschiavo.shop.model.cliente.endereco;

import lombok.Builder;

@Builder
public record MostrarEnderecoDTO(
		Long id,
		String cep,
		String rua,
		String numero,
		String complemento,
		String bairro,
		String cidade,
		String estado,
		Boolean enderecoPadrao
		) {
}
