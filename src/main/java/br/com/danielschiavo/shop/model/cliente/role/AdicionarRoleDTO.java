package br.com.danielschiavo.shop.model.cliente.role;

import jakarta.validation.constraints.NotNull;

public record AdicionarRoleDTO(
		@NotNull
		Long idCliente,
		@NotNull
		String role
		) {

}
