package com.futurebeer.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="item_pedido")
public class ItemPedido implements Serializable{
	private static final long serialVersionUID = -8722108272869452401L;
	
	@Id
	@Column(name="item_pedido_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="qtdade", nullable=false)
	private int qtdade;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="pedido_id", referencedColumnName="pedido_id")
	private Pedido pedido;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="produto_id", referencedColumnName="produto_id")
	private Produto produto;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQtdade() {
		return qtdade;
	}

	public void setQtdade(int qtdade) {
		this.qtdade = qtdade;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
}