package com.visiontech.repositories;

import com.visiontech.entities.Incidente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface IncidenteRepository extends JpaRepository<Incidente, Integer> {
    @Query("Select i from Incidente i where i.tipo like %:tipo%")
    public List<Incidente> buscarTipo(@Param("tipo") String tipo);
}
