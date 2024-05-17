package br.com.danielschiavo.shop.model.cliente.role;

import jakarta.validation.constraints.NotNull;

public record RoleDTO(
		@NotNull
		Long idCliente,
		@NotNull
		NomeRole role
		) {

}
