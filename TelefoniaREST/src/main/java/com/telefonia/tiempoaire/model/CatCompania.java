package com.telefonia.tiempoaire.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cat_compania")
public class CatCompania implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id_cat_compania;
	@Column(length = 40)
	private String codigo_cat_compania;
	@Column(length = 9)
	private String operadora;
	@Column(length = 40)
	private String url;
	
	public Integer getId_cat_compania() {
		return id_cat_compania;
	}
	public void setId_cat_compania(Integer id_cat_compania) {
		this.id_cat_compania = id_cat_compania;
	}
	public String getCodigo_cat_compania() {
		return codigo_cat_compania;
	}
	public void setCodigo_cat_compania(String codigo_cat_compania) {
		this.codigo_cat_compania = codigo_cat_compania;
	}
	public String getOperadora() {
		return operadora;
	}
	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}	
	
}
