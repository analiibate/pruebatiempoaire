package com.telefonia.tiempoaire.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.*;

@Entity
@Table(name="recarga")
public class Recarga  implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id_recarga;
	@Column(length = 15)
	private String celular;
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "id_compania_paquete")
	@Fetch(FetchMode.JOIN)
	private CompaniaPaquete compania_paquete;
	@Column(columnDefinition = "TIMESTAMP")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime fecha_aplicacion;
	private boolean status_aplicacion;
	
	public Integer getId_recarga() {
		return id_recarga;
	}
	public void setId_recarga(Integer id_recarga) {
		this.id_recarga = id_recarga;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public CompaniaPaquete getCompania_paquete() {
		return compania_paquete;
	}
	public void setCompania_paquete(CompaniaPaquete compania_paquete) {
		this.compania_paquete = compania_paquete;
	}
	public LocalDateTime getFecha_aplicacion() {
		return fecha_aplicacion;
	}
	public void setFecha_aplicacion(LocalDateTime fecha_aplicacion) {
		this.fecha_aplicacion = fecha_aplicacion;
	}
	public boolean isStatus_aplicacion() {
		return status_aplicacion;
	}
	public void setStatus_aplicacion(boolean status_aplicacion) {
		this.status_aplicacion = status_aplicacion;
	}
	
	@Override
	public String toString() {
		return "Recarga [celular=" + celular + ", paquete=" + compania_paquete.getDesc_compania_paquete() + ", fecha=" + fecha_aplicacion+"]";
	}
}


