package br.com.danielschiavo.shop.model.pedido.dto;

import br.com.danielschiavo.shop.model.pedido.pagamento.MetodoPagamento;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record CriarPagamentoDTO(
				@NotNull
				MetodoPagamento metodoPagamento,
				Long idCartao,
				String numeroParcelas
		) {

}
