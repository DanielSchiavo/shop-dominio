package br.com.danielschiavo.shop.model.pedido.pagamento;

import br.com.danielschiavo.shop.model.cliente.Cliente;
import br.com.danielschiavo.shop.model.pedido.dto.CriarPedidoDTO;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class ProcessadorPagamento {
	
	private CriarPedidoDTO criarPedidoDTO;
	
	private Cliente cliente;
	
	public abstract boolean executa();
	
}
