package br.com.danielschiavo.shop.model.cliente.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record AlterarFotoPerfilDTO(
	    @NotBlank
	    @Pattern(regexp = ".*\\..*")
		String nomeNovaFotoPerfil
		) {
	
}
