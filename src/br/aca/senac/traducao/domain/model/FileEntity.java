package br.aca.senac.traducao.domain.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FILE_UPLOAD")
public class FileEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 131644406454254720L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	@Column(name = "FILE_NAME", unique = true)
	private String name;
	@Column(name = "FILE_YEAR")
	private String year;
	@Column(name = "FILE_MONTH")
	private String month;
	@Column(name = "FILE_CONTENT_TYPE")
	private String type;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "FileEntity{" + "id=" + id + ", name='" + name + '\''
				+ ", year='" + year + '\'' + ", month='" + month + '\''
				+ ", type='" + type + '\'' + '}';
	}
}
