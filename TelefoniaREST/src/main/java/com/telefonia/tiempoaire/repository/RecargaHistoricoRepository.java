package com.telefonia.tiempoaire.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.telefonia.tiempoaire.model.RecargaHistorico;

public interface RecargaHistoricoRepository extends JpaRepository<RecargaHistorico, Integer> {

	@Query(value="select id_recarga_historico, recarga, fecha_aplicacion, hora_aplicacion from #{#entityName} where fecha_aplicacion >= :fechaini and fecha_aplicacion <= :fechafin")
	public List<RecargaHistorico> getRecargaHistorico(@Param("fechaini") String fechaIni, @Param("fechafin") String fechaFin);
}
