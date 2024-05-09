package br.com.danielschiavo.shop.model.cliente.dto;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import br.com.danielschiavo.shop.model.cliente.cartao.MostrarCartaoDTO;
import br.com.danielschiavo.shop.model.cliente.endereco.MostrarEnderecoDTO;
import br.com.danielschiavo.shop.model.cliente.role.Role;
import br.com.danielschiavo.shop.model.filestorage.ArquivoInfoDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(Include.NON_NULL)
public class MostrarClienteDTO {
	
	private Long id;
	private String cpf;
	private String nome;
	private String sobrenome;
	private LocalDate dataNascimento;
	private LocalDate dataCriacaoConta;
	private String email;
	private String celular;
	private ArquivoInfoDTO fotoPerfil;
}
