package br.com.danielschiavo.shop.model.pedido.entrega;

import br.com.danielschiavo.shop.model.pedido.TipoEntrega;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record CriarEntregaDTO(
			@NotNull
			TipoEntrega tipoEntrega,
			Long idEndereco
		) {

}
