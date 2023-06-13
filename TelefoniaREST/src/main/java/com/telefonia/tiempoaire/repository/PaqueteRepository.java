package com.telefonia.tiempoaire.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.telefonia.tiempoaire.model.CompaniaPaquete;

public interface PaqueteRepository extends JpaRepository<CompaniaPaquete, Integer> {
	}
