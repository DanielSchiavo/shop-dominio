package br.com.danielschiavo.shop.model.pedido.entrega.implementacao;

import br.com.danielschiavo.shop.model.pedido.entrega.ProcessadorEntrega;

public class ProcessarEntregaCorreios extends ProcessadorEntrega {

	@Override
	public boolean executa() {
		System.out.println("Processando entrega via correios para o cliente " + super.getCliente().getNome());
		return false;
	}

}
