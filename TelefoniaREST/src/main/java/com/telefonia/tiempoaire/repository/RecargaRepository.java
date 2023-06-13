package com.telefonia.tiempoaire.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.telefonia.tiempoaire.model.Recarga;

public interface RecargaRepository extends JpaRepository<Recarga, Integer> {
	
	@Query(value="select max(fecha_aplicacion) from #{#entityName} where celular=:celular and compania_paquete.id_compania_paquete=:idpaquete and status_aplicacion=true")
	public LocalDateTime existePaquete(@Param("celular") String celular, @Param("idpaquete") Integer idPaquete);
	
	@Query(value="select compania_paquete, count(compania_paquete) \r\n"
			+ "from Recarga r \r\n"
			+ "where date_format(fecha_aplicacion, '%Y-%m-%d') = CURDATE() and status_aplicacion=true\r\n"
			+ "group by   compania_paquete ")
	public List<Recarga> getTotales();
	
}
