package br.com.danielschiavo.shop.model.pedido.entrega;

import br.com.danielschiavo.shop.model.cliente.Cliente;
import br.com.danielschiavo.shop.model.pedido.dto.CriarPedidoDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class ProcessadorEntrega {
	
	private CriarPedidoDTO criarPedidoDTO;
	
	private Cliente cliente;
	
	public abstract boolean executa();

}
