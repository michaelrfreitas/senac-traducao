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
public class Gerente {

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

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_manage")
	@Cascade(CascadeType.ALL)
	private Manage manage;

	public Gerente() {
		super();
	}

	public Gerente(String nome) {
		super();
		this.nome = nome;
	}

	public Gerente(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}

	public Gerente(String nome, String cpf, Usuario usuario) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.usuario = usuario;
	}

	public Gerente(Manage manage) {
		super();
		this.manage = manage;
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

	public Manage getManage() {
		return manage;
	}

	public void setManage(Manage manage) {
		this.manage = manage;
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

	public void validarManage() {
		// TODO
	}
}
