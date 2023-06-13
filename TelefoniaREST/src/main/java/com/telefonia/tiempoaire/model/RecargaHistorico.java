package com.telefonia.tiempoaire.model;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="recarga_historico")
public class RecargaHistorico implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id_recarga_historico;
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "id_recarga")
	private Recarga recarga;
	@Column(length = 10)
	private String fecha_aplicacion;
	@Column(length = 10)
	private String hora_aplicacion;
	
	public Integer getId_recarga_historico() {
		return id_recarga_historico;
	}
	public void setId_recarga_historico(Integer id_recarga_historico) {
		this.id_recarga_historico = id_recarga_historico;
	}
	public Recarga getRecarga() {
		return recarga;
	}
	public void setRecarga(Recarga recarga) {
		this.recarga = recarga;
	}
	public String getFecha_aplicacion() {
		return fecha_aplicacion;
	}
	public void setFecha_aplicacion(String fecha_aplicacion) {
		this.fecha_aplicacion = fecha_aplicacion;
	}
	public String getHora_aplicacion() {
		return hora_aplicacion;
	}
	public void setHora_aplicacion(String hora_aplicacion) {
		this.hora_aplicacion = hora_aplicacion;
	}
	
}
