package com.telefonia.tiempoaire.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telefonia.tiempoaire.model.CompaniaPaquete;
import com.telefonia.tiempoaire.service.PaqueteService;

@RestController
@RequestMapping("/telefonia")
public class PaqueteController {
	@Autowired
	private PaqueteService servicio;
	
	@GetMapping("/consultarPaquetes")
	public List<CompaniaPaquete> getPaquete(){
		return servicio.getPaquete();
	}
}
