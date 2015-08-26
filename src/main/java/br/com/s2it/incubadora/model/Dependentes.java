package br.com.s2it.incubadora.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "dependentes")

public class Dependentes implements Serializable {

	private static final long serialVersionUID = 1L;

	public Dependentes() {

	}

	public Dependentes(int cod) {
		this.cod = cod;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cod;

	@Column(name = "nome")
	private String nome;
	@Column(name = "cpf")
	private String cpf;
	@Column(name = "rg")
	private String rg;
	@Column(name = "rendaAnual")
	private BigDecimal rendaAnual;
	@Column(name = "dataNasc")
	private Date dataNasc;

	private Contribuinte contribuinte;

	@ManyToOne
	@JoinColumn(name = "codContribuinte")
	public Contribuinte getContribuinte() {
		return contribuinte;
	}

	// public void setContribuinte(Contribuinte contribuinte) {
	// this.contribuinte = contribuinte;
	// }
	//
	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
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

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

}
