package br.com.everis.estacionamento.controller.dto;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import br.com.everis.estacionamento.model.CatStatus;
import br.com.everis.estacionamento.model.Categoria;

public class CategoriaDto {
	
	private Long id;
	private String descricao;
	private BigDecimal valorhora;
	private CatStatus status;
	
	public CategoriaDto(Categoria categoria) {
		this.id = categoria.getIdcategoria();
		this.descricao = categoria.getDescricao();
		this.valorhora = categoria.getValorhora();
		this.status = categoria.getCatStatus();
		
	}
	
	public Long getId() {
		return id;
	}
	public String getDescricao() {
		return descricao;
	}
	public BigDecimal getValorhora() {
		return valorhora;
	}
	public CatStatus getStatus() {
		return status;
	}

	public static List<CategoriaDto> converter(List<Categoria> categorias) {
		return categorias.stream().map(CategoriaDto::new).collect(Collectors.toList());
	}
	
}
