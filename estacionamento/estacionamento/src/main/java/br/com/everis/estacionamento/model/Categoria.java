package br.com.everis.estacionamento.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_CATEGORIA")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idcategoria;
	
	@Enumerated(EnumType.STRING)
	private CatStatus status;
	private BigDecimal valorhora;
	private String descricao;
	
	//construtor default
	public Categoria() {
	}

	// contrutor para o controller
	public Categoria(String descricao, BigDecimal valorhora, CatStatus status) {
		this.descricao = descricao;
		this.valorhora = valorhora;
		this.status = status;
	}

	// getter e setter
	public long getIdcategoria() {
		return idcategoria;
	}
	public void setIdcategoria(long idcategoria) {
		this.idcategoria = idcategoria;
	}
	public CatStatus getCatStatus() {
		return status;
	}
	public void setCatStatus(CatStatus status) {
		this.status = status;
	}
	public BigDecimal getValorhora() {
		return valorhora;
	}
	public void setValorhora(BigDecimal valorhora) {
		this.valorhora = valorhora;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
