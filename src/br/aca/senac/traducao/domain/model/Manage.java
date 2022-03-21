package br.aca.senac.traducao.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Manage {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_cliente")
	@Cascade(CascadeType.ALL)
	private Cliente cliente;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_pedido")
	@Cascade(CascadeType.ALL)
	private Pedido pedido;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_tradutor")
	@Cascade(CascadeType.ALL)
	private Tradutor tradutor;

	public Manage() {
		super();
	}

	public Manage(Cliente cliente) {
		super();
		this.cliente = cliente;
	}

	public Manage(Pedido pedido) {
		super();
		this.pedido = pedido;
	}

	public Manage(Tradutor tradutor) {
		super();
		this.tradutor = tradutor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Tradutor getTradutor() {
		return tradutor;
	}

	public void setTradutor(Tradutor tradutor) {
		this.tradutor = tradutor;
	}

}
