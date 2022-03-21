package br.aca.senac.traducao.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	private String login;
	private String senha;
	private String email;
	private String tel_celular;
	private String tel_fixo;
	private String logradouro;
	private int numero;
	private String cidade;
	private String complemento;
	private Pais pais;

	public Usuario() {
		super();
	}

	public Usuario(String login) {
		super();
		this.login = login;
	}

	public Usuario(String login, String senha) {
		super();
		this.login = login;
		this.senha = senha;
	}

	public Usuario(String login, String senha, String email) {
		super();
		this.login = login;
		this.senha = senha;
		this.email = email;
	}

	public Usuario(String login, String senha, String email, String tel_celular) {
		super();
		this.login = login;
		this.senha = senha;
		this.email = email;
		this.tel_celular = tel_celular;
	}

	public Usuario(String login, String senha, String email,
			String tel_celular, String tel_fixo) {
		super();
		this.login = login;
		this.senha = senha;
		this.email = email;
		this.tel_celular = tel_celular;
		this.tel_fixo = tel_fixo;
	}

	public Usuario(String login, String senha, String email,
			String tel_celular, String tel_fixo, String logradouro) {
		super();
		this.login = login;
		this.senha = senha;
		this.email = email;
		this.tel_celular = tel_celular;
		this.tel_fixo = tel_fixo;
		this.logradouro = logradouro;
	}

	public Usuario(String login, String senha, String email,
			String tel_celular, String tel_fixo, String logradouro, int numero) {
		super();
		this.login = login;
		this.senha = senha;
		this.email = email;
		this.tel_celular = tel_celular;
		this.tel_fixo = tel_fixo;
		this.logradouro = logradouro;
		this.numero = numero;
	}

	public Usuario(String login, String senha, String email,
			String tel_celular, String tel_fixo, String logradouro, int numero,
			String cidade) {
		super();
		this.login = login;
		this.senha = senha;
		this.email = email;
		this.tel_celular = tel_celular;
		this.tel_fixo = tel_fixo;
		this.logradouro = logradouro;
		this.numero = numero;
		this.cidade = cidade;
	}

	public Usuario(String login, String senha, String email,
			String tel_celular, String tel_fixo, String logradouro, int numero,
			String cidade, String complemento) {
		super();
		this.login = login;
		this.senha = senha;
		this.email = email;
		this.tel_celular = tel_celular;
		this.tel_fixo = tel_fixo;
		this.logradouro = logradouro;
		this.numero = numero;
		this.cidade = cidade;
		this.complemento = complemento;
	}

	public Usuario(String login, String senha, String email,
			String tel_celular, String tel_fixo, String logradouro, int numero,
			String cidade, String complemento, Pais pais) {
		super();
		this.login = login;
		this.senha = senha;
		this.email = email;
		this.tel_celular = tel_celular;
		this.tel_fixo = tel_fixo;
		this.logradouro = logradouro;
		this.numero = numero;
		this.cidade = cidade;
		this.complemento = complemento;
		this.pais = pais;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel_celular() {
		return tel_celular;
	}

	public void setTel_celular(String tel_celular) {
		this.tel_celular = tel_celular;
	}

	public String getTel_fixo() {
		return tel_fixo;
	}

	public void setTel_fixo(String tel_fixo) {
		this.tel_fixo = tel_fixo;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	public void validarLogin() {
		// TODO
	}

	public void validarSenha() {
		// TODO
	}

	public void validarEmail() {
		// TODO
	}

	public void validarTel_celular() {
		// TODO
	}

	public void validarTel_fixo() {
		// TODO
	}

	public void validarLogradouro() {
		// TODO
	}

	public void validarNumero() {
		// TODO
	}

	public void validarCidade() {
		// TODO
	}

	public void validarComplemento() {
		// TODO
	}

	public void validarPais() {
		// TODO
	}
}
