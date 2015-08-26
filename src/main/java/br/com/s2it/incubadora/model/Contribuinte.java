package br.com.s2it.incubadora.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "contribuinte")
public class Contribuinte implements Serializable {

	private static final long serialVersionUID = 1L;

	public Contribuinte() {

	}

	public Contribuinte(int cod) {
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

	private Set<Dependentes> dependentes;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "contribuinte")
	public Set<Dependentes> getDependentes() {
		return dependentes;
	}

	// public void setDependentes(Dependentes dependentes) {
	// this.dependentes = (Set<Dependentes>) dependentes;
	// }

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

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

	public BigDecimal getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(BigDecimal rendaAnual) {
		this.rendaAnual = rendaAnual;
	}

}
