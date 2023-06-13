package com.telefonia.tiempoaire.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cat_paquete")
public class CatPaquete  implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id_cat_paquete;
	private Integer monto_cat_paquete;
	
	public Integer getId_cat_paquete() {
		return id_cat_paquete;
	}
	public void setId_cat_paquete(Integer id_cat_paquete) {
		this.id_cat_paquete = id_cat_paquete;
	}
	public Integer getMonto_cat_paquete() {
		return monto_cat_paquete;
	}
	public void setMonto_cat_paquete(Integer monto_cat_paquete) {
		this.monto_cat_paquete = monto_cat_paquete;
	}
	
	
}
