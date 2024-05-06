package br.com.danielschiavo.shop.model.pedido.entrega.implementacao;

import br.com.danielschiavo.shop.model.pedido.entrega.ProcessadorEntrega;

public class ProcessarEntregaExpressa extends ProcessadorEntrega {

	@Override
	public boolean executa() {
		System.out.println("Processando entrega expressa para o cliente " + super.getCliente().getNome());
		return true;
	}

}
