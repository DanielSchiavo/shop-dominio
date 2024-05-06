package br.com.danielschiavo.shop.model.cliente.cartao;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;

@Builder
public record CadastrarCartaoDTO(
		@NotBlank
		@Size(min=5, max=5)
		String validadeCartao,
		@NotBlank
		@Size(min=16, max=16)
		String numeroCartao,
		@NotBlank
		String nomeNoCartao,
		@NotNull
		Boolean cartaoPadrao,
		@NotNull
		TipoCartao tipoCartao
		) {

}
