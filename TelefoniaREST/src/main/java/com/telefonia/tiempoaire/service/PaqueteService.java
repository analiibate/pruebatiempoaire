package com.telefonia.tiempoaire.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telefonia.tiempoaire.model.CompaniaPaquete;
import com.telefonia.tiempoaire.repository.PaqueteRepository;

@Service
public class PaqueteService {
	
	private static Logger log = LogManager.getLogger(RecargaHistoricoService.class);
	@Autowired
	private PaqueteRepository repositorioPaquete;
	
	/*
	 * Método para consultar los paquetes disponibles para recargar tiempo aire
	 */
	public List<CompaniaPaquete> getPaquete(){
		return repositorioPaquete.findAll();
	}

}
