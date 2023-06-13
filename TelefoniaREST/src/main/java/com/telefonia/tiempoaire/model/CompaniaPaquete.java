package com.telefonia.tiempoaire.model;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="compania_paquete")
public class CompaniaPaquete implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id_compania_paquete;
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "id_cat_compania")
	private CatCompania compania;
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "id_cat_paquete")
	private CatPaquete paquete;
	@Column(length = 40)
	private String desc_compania_paquete;
	
	public Integer getId_compania_paquete() {
		return id_compania_paquete;
	}
	public void setId_compania_paquete(Integer id_compania_paquete) {
		this.id_compania_paquete = id_compania_paquete;
	}
	public CatCompania getCompania() {
		return compania;
	}
	public void setCompania(CatCompania compania) {
		this.compania = compania;
	}
	public CatPaquete getPaquete() {
		return paquete;
	}
	public void setPaquete(CatPaquete paquete) {
		this.paquete = paquete;
	}
	public String getDesc_compania_paquete() {
		return desc_compania_paquete;
	}
	public void setDesc_compania_paquete(String desc_compania_paquete) {
		this.desc_compania_paquete = desc_compania_paquete;
	}
	
}
