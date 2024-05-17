package br.com.danielschiavo.shop.model.cliente.carrinho;

public class CarrinhoNaoExisteException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public CarrinhoNaoExisteException(String message) {
        super(message);
    }

}
