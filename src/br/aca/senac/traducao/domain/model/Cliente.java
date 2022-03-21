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
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	private String nome_razao;
	private char cpf_cnpj[];
	private String representante;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_usuario")
	@Cascade(CascadeType.ALL)
	private Usuario usuario;

	@OneToMany(fetch = FetchType.LAZY)
	@Cascade(CascadeType.ALL)
	private Collection<Pedido> pedidos = new ArrayList<Pedido>();

	public Cliente() {
		super();
	}

	public Cliente(String nome_razao) {
		super();
		this.nome_razao = nome_razao;
	}

	public Cliente(String nome_razao, char[] cpf_cnpj) {
		super();
		this.nome_razao = nome_razao;
		this.cpf_cnpj = cpf_cnpj;
	}

	public Cliente(String nome_razao, char[] cpf_cnpj, String representante) {
		super();
		this.nome_razao = nome_razao;
		this.cpf_cnpj = cpf_cnpj;
		this.representante = representante;
	}

	public Cliente(String nome_razao, char[] cpf_cnpj, String representante,
			Usuario usuario) {
		super();
		this.nome_razao = nome_razao;
		this.cpf_cnpj = cpf_cnpj;
		this.representante = representante;
		this.usuario = usuario;
	}

	@SuppressWarnings("unchecked")
	public Cliente(String nome_razao, char[] cpf_cnpj, String representante,
			Usuario usuario, Pedido pedido) {
		super();
		this.nome_razao = nome_razao;
		this.cpf_cnpj = cpf_cnpj;
		this.representante = representante;
		this.usuario = usuario;
		this.pedidos = (Collection<Pedido>) pedido;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome_razao() {
		return nome_razao;
	}

	public void setNome_razao(String nome_razao) {
		this.nome_razao = nome_razao;
	}

	public char[] getCpf_cnpj() {
		return cpf_cnpj;
	}

	public void setCpf_cnpj(char[] cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}

	public String getRepresentante() {
		return representante;
	}

	public void setRepresentante(String representante) {
		this.representante = representante;
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

	public void validarNome_razao() {
		// TODO
	}

	public void validarCpf_cnpj() {
		// TODO
	}

	public void validarRepresentante() {
		// TODO
	}

	public void validarUsuario() {
		// TODO
	}

	public void validarPedido() {
		// TODO
	}
}
