package net.natura.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pedido_dados_pagamento", schema = "siscpt")
public class Pedido {

	@Id
	@Column(name = "nm_pedido")
	private Long nmPedido;
	@Column(name = "dt_cancelamento_pedido")
	private Date dtCancelamento;
	

	public Date getDtCancelamento() {
		return dtCancelamento;
	}

	public void setDtCancelamento(Date dtCancelamento) {
		this.dtCancelamento = dtCancelamento;
	}

	public Long getNmPedido() {
		return nmPedido;
	}

	public void setNmPedido(Long nmPedido) {
		this.nmPedido = nmPedido;
	}

}
