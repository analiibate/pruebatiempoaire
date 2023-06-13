package com.telefonia.tiempoaire.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.telefonia.tiempoaire.model.RecargaHistorico;
import com.telefonia.tiempoaire.service.RecargaHistoricoService;

@RestController
@RequestMapping("/telefonia")
public class RecargaHistoricoController {

	@Autowired
	private RecargaHistoricoService servicioHistorico;
	
	/*Generar reporte de recargas del día o por periodo*/
	@GetMapping("/consultarHistorico/{fechaIni}/{fechaFin}")
	public List<RecargaHistorico> getRecargaHistorico(@PathVariable String fechaIni, @PathVariable String fechaFin){
			return servicioHistorico.getRecargaHistorico(fechaIni, fechaFin);
	}
	
	/*Generar reporte de recargas del día o por periodo*/
	@GetMapping("/consultarHistorico")
	public List<RecargaHistorico> getRecargaHistorico(){
			return servicioHistorico.getHistorico();
	}
}
