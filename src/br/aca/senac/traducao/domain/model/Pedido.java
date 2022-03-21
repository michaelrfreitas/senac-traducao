package br.aca.senac.traducao.domain.model;

import java.io.Serializable;
import java.util.Date;

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
public class Pedido implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4431083593275900046L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	private String descricao;
	private Date data;
	private int num_palavras;
	private double valor_palavra;
	private double valor_total;
	private Idioma idioma_origem;
	private Idioma idioma_destino;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_arquivo")
	@Cascade(CascadeType.ALL)
	private FileEntity arquivo;

	private Status status;

	public Pedido() {
		super();
	}

	public Pedido(String descricao) {
		super();
		this.descricao = descricao;
	}

	public Pedido(String descricao, Date data) {
		super();
		this.descricao = descricao;
		this.data = data;
	}

	public Pedido(String descricao, Date data, int num_palavras) {
		super();
		this.descricao = descricao;
		this.data = data;
		this.num_palavras = num_palavras;
	}

	public Pedido(String descricao, Date data, int num_palavras,
			double valor_palavra) {
		super();
		this.descricao = descricao;
		this.data = data;
		this.num_palavras = num_palavras;
		this.valor_palavra = valor_palavra;
	}

	public Pedido(String descricao, Date data, int num_palavras,
			double valor_palavra, double valor_total) {
		super();
		this.descricao = descricao;
		this.data = data;
		this.num_palavras = num_palavras;
		this.valor_palavra = valor_palavra;
		this.valor_total = valor_total;
	}

	public Pedido(String descricao, Date data, int num_palavras,
			double valor_palavra, double valor_total, Idioma idioma_origem,
			Idioma idioma_destino) {
		super();
		this.descricao = descricao;
		this.data = data;
		this.num_palavras = num_palavras;
		this.valor_palavra = valor_palavra;
		this.valor_total = valor_total;
		this.idioma_origem = idioma_origem;
		this.idioma_destino = idioma_destino;
	}

	public Pedido(String descricao, Date data, int num_palavras,
			double valor_palavra, double valor_total, Idioma idioma_origem,
			Idioma idioma_destino, FileEntity arquivo) {
		super();
		this.descricao = descricao;
		this.data = data;
		this.num_palavras = num_palavras;
		this.valor_palavra = valor_palavra;
		this.valor_total = valor_total;
		this.idioma_origem = idioma_origem;
		this.idioma_destino = idioma_destino;
		this.arquivo = arquivo;
	}

	public Pedido(String descricao, Date data, int num_palavras,
			double valor_palavra, double valor_total, Idioma idioma_origem,
			Idioma idioma_destino, FileEntity arquivo, Status status) {
		super();
		this.descricao = descricao;
		this.data = data;
		this.num_palavras = num_palavras;
		this.valor_palavra = valor_palavra;
		this.valor_total = valor_total;
		this.idioma_origem = idioma_origem;
		this.idioma_destino = idioma_destino;
		this.arquivo = arquivo;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getNum_palavras() {
		return num_palavras;
	}

	public void setNum_palavras(int num_palavras) {
		this.num_palavras = num_palavras;
	}

	public double getValor_palavra() {
		return valor_palavra;
	}

	public void setValor_palavra(double valor_palavra) {
		this.valor_palavra = valor_palavra;
	}

	public double getValor_total() {
		return valor_total;
	}

	public void setValor_total(double valor_total) {
		this.valor_total = valor_total;
	}

	public Idioma getIdioma_origem() {
		return idioma_origem;
	}

	public void setIdioma_origem(Idioma idioma_origem) {
		this.idioma_origem = idioma_origem;
	}

	public Idioma getIdioma_destino() {
		return idioma_destino;
	}

	public void setIdioma_destino(Idioma idioma_destino) {
		this.idioma_destino = idioma_destino;
	}

	public FileEntity getArquivo() {
		return arquivo;
	}

	public void setArquivo(FileEntity arquivo) {
		this.arquivo = arquivo;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public void validarDescricao() {
		// TODO
	}

	public void validarData() {
		// TODO
	}

	public void validarNum_palavras() {
		// TODO
	}

	public void validarValor_palavra() {
		// TODO
	}

	public void validarValor_total() {
		// TODO
	}

	public void validarIdioma_origem() {
		// TODO
	}

	public void validarIdioma_destino() {
		// TODO
	}

	public void validarArquivo() {
		// TODO
	}

	public void validarStatus() {
		// TODO
	}
}
