package br.com.danielschiavo.shop.model.pedido.entrega.implementacao;

import br.com.danielschiavo.shop.model.pedido.entrega.ProcessadorEntrega;

public class ProcessarEntregaDigital extends ProcessadorEntrega {

	@Override
	public boolean executa() {
		System.out.println("Processando entrega digital para o cliente " + super.getCliente().getNome());
		return true;
	}

}
