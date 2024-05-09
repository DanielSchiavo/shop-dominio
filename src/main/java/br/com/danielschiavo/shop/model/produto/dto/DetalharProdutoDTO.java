package br.com.danielschiavo.shop.model.produto.dto;

import java.math.BigDecimal;
import java.util.List;

import br.com.danielschiavo.shop.model.filestorage.ArquivoInfoDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DetalharProdutoDTO {

	private Long id;
	private String nome; 
	private String descricao;
	private BigDecimal preco;
	private Integer quantidade;
	private Boolean ativo;
	private List<ArquivoInfoDTO> arquivos;
	private Long subCategoria;
	
}
