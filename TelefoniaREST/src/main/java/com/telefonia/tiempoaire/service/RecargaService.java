package com.telefonia.tiempoaire.service;

import java.time.LocalDateTime;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.telefonia.tiempoaire.model.Recarga;
import com.telefonia.tiempoaire.repository.RecargaRepository;
import com.telefonia.utils.Constantes;

@Service
public class RecargaService {
	
	private static Logger log = LogManager.getLogger(RecargaService.class);
	@Autowired
	private RecargaRepository repositorioRecarga;

	/* Método para recargar tiempoAire */
	public Recarga recargarTiempoAire(Recarga recarga) {
		// validar que el mismo paquete no haya sido aplicado hace 15 min (regla de negocio) 
		try {
			if (!validarPaqueteDuplicado(recarga)) {
				boolean recarga_aplicada = true;
				recarga.setStatus_aplicacion(recarga_aplicada); 
				repositorioRecarga.save(recarga);
				/* 
				 En este apartado se debería invocar el servicio de la compañia que aplique la
				 recarga al numero telefonico.
				 crear variable bool recarga_aplicada que será true si la recarga se aplica exitosamente 
				 o false en otro caso
				 	recarga.setStatus_aplicacion(recarga_aplicada); 
				 Posteriormente deberá actualizarse el estatus en la BD
					repositorioRecarga.save(recarga);
				 */
			}
		} catch(Exception ex) {
			log.error("Ocurrio un error al recargar tiempo aire [recargarTiempoAire]: "+ex.getStackTrace());
		}
		return recarga;
		
	}

	/*
	 * Método para validar si existe la compra del mismo paquete para el mismo
	 * número de teléfono durante 15 minutos
	 */
	public boolean validarPaqueteDuplicado(Recarga recarga) {
		boolean paquete_duplicado = false;
		LocalDateTime fechaMayor = repositorioRecarga.existePaquete(recarga.getCelular(),
				recarga.getCompania_paquete().getId_compania_paquete());
		LocalDateTime quinceMinAntes = LocalDateTime.now().plusMinutes(-15);
		//log.info("" + quinceMinAntes + " - " + fechaMayor);
		if (fechaMayor != null && quinceMinAntes.isBefore(fechaMayor)) {
			log.info(Constantes.RECARGAR_TAIRE_FALLO + recarga.toString());
			paquete_duplicado = true;
		} else {
			paquete_duplicado = false;
		}
		return paquete_duplicado;
	}
	
	/*
	 * 	Consulta ganancia del dia, total de ventas del dia, por monto, por compañia
	 */
	public List<Recarga> getTotales() {
		return repositorioRecarga.getTotales();
	}
	
}
