package com.telefonia.tiempoaire.service;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.telefonia.tiempoaire.model.RecargaHistorico;
import com.telefonia.tiempoaire.repository.RecargaHistoricoRepository;

@Service
public class RecargaHistoricoService {

	private static Logger log = LogManager.getLogger(RecargaHistoricoService.class);
	@Autowired
	private RecargaHistoricoRepository repositorioHistorico;

	/*
	 * Método para consultar el historico de recargas realizadas por periodo
	 */
	public List<RecargaHistorico> getRecargaHistorico(String fechaIni, String fechaFin) {
		return repositorioHistorico.getRecargaHistorico(fechaIni, fechaFin);
	}

	/*
	 * Método para consultar el historico de recargas realizadas
	 */
	public List<RecargaHistorico> getHistorico() {
		return repositorioHistorico.findAll();
	}

}
