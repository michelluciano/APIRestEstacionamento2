package br.com.everis.estacionamento.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Veiculo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idveiculo;
	
	private String placaveiculo;
	private String marcaveiculo;
	private String modeloveiculo;
	private String corveiculo;
	
	@JoinColumn(name="fk_idcategoria") 
	@ManyToOne
	private Categoria categoria;

	//construtor padrão
	public Veiculo() {
	}
	
	//construtor para o controller
	public Veiculo(String placaveiculo, String marcaveiculo, String modeloveiculo, String corveiculo,
			Categoria categoria) {
		this.placaveiculo = placaveiculo;
		this.marcaveiculo = marcaveiculo;
		this.modeloveiculo = modeloveiculo;
		this.corveiculo = corveiculo;
		this.categoria = categoria;
	}



	public Long getIdveiculo() {
		return idveiculo;
	}

	public void setIdveiculo(Long idveiculo) {
		this.idveiculo = idveiculo;
	}

	public String getPlacaveiculo() {
		return placaveiculo;
	}

	public void setPlacaveiculo(String placaveiculo) {
		this.placaveiculo = placaveiculo;
	}

	public String getMarcaveiculo() {
		return marcaveiculo;
	}

	public void setMarcaveiculo(String marcaveiculo) {
		this.marcaveiculo = marcaveiculo;
	}

	public String getModeloveiculo() {
		return modeloveiculo;
	}

	public void setModeloveiculo(String modeloveiculo) {
		this.modeloveiculo = modeloveiculo;
	}

	public String getCorveiculo() {
		return corveiculo;
	}

	public void setCorveiculo(String corveiculo) {
		this.corveiculo = corveiculo;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
}
