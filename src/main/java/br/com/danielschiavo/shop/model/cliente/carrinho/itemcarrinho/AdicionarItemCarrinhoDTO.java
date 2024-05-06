package br.com.danielschiavo.shop.model.cliente.carrinho.itemcarrinho;

import org.springframework.format.annotation.NumberFormat;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Builder;

@Builder
public record AdicionarItemCarrinhoDTO(
		@NotNull
		@NumberFormat
		@Positive
		Long produtoId,
		@NotNull
		@NumberFormat
		Integer quantidade
		) {

}
