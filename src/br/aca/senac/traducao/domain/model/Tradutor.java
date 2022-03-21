package br.aca.senac.traducao.domain.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Tradutor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	private String nome;
	private String cpf;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_usuario")
	@Cascade(CascadeType.ALL)
	private Usuario usuario;

	@OneToMany(fetch = FetchType.LAZY)
	@Cascade(CascadeType.ALL)
	private Collection<Pedido> pedidos = new ArrayList<Pedido>();

	public Tradutor() {
		super();
	}

	public Tradutor(String nome) {
		super();
		this.nome = nome;
	}

	public Tradutor(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}

	public Tradutor(String nome, String cpf, Usuario usuario) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.usuario = usuario;
	}

	@SuppressWarnings("unchecked")
	public Tradutor(String nome, String cpf, Usuario usuario, Pedido pedido) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.usuario = usuario;
		this.pedidos = (Collection<Pedido>) pedido;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Collection<Pedido> getPedidos() {
		return this.pedidos;
	}

	public void addPedido(Pedido pedido) {
		this.pedidos.add(pedido);
	}
	
	public void validarNome() {
		// TODO
	}

	public void validarCpf() {
		// TODO
	}

	public void validarUsuario() {
		// TODO
	}

	public void validarPedido() {
		// TODO
	}
}
