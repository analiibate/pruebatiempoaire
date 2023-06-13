package com.telefonia.tiempoaire.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.telefonia.tiempoaire.model.Recarga;
import com.telefonia.tiempoaire.service.RecargaService;

@RestController
@RequestMapping("/telefonia")
public class RecargaController {

	@Autowired
	private RecargaService servicio;	
	
	/*Recargar tiempo aire*/
	@PostMapping("/recargarTiempoAire")
	public ResponseEntity<Recarga> recargarTiempoAire(@RequestBody Recarga recarga){
			Recarga nueva_recarga = servicio.recargarTiempoAire(recarga);	
			return new ResponseEntity<>(nueva_recarga, HttpStatus.CREATED);
	}
	
	/*Consulta ganancia del dia, total de ventas del dia, por monto, por compañia*/
//	@GetMapping("/consultarTotalesDia")
//	public List<Recarga> getConsultarTotales (){
//			return servicio.getTotales();
//	}
	
	
}
