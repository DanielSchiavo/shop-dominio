package br.com.danielschiavo.shop.model.pedido.pagamento;

import java.time.LocalDateTime;

import br.com.danielschiavo.shop.model.pedido.Pedido;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Table(name = "pedidos_pagamento")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "pedido")
@Builder
@EqualsAndHashCode(of = "id")
@Entity
public class Pagamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;

	@Enumerated(EnumType.STRING)
	@Column(name = "metodo_pagamento")
	private MetodoPagamento metodoPagamento;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "status_pagamento")
	private StatusPagamento statusPagamento;
	
	private LocalDateTime dataPagamento;

	@Embedded
	private CartaoPedido cartaoPedido;
	
	@OneToOne(mappedBy = "pagamento")
	private Pedido pedido;
	
}
