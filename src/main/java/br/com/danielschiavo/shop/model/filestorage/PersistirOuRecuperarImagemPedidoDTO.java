package br.com.danielschiavo.shop.model.filestorage;

import lombok.Builder;

@Builder
public record PersistirOuRecuperarImagemPedidoDTO(
		String nomePrimeiraImagemProduto,
		Long idProduto
		) {

}
