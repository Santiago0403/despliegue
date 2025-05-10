package com.visiontech.repositories;

import com.visiontech.entities.Ruta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RutaRepository extends JpaRepository<Ruta, Integer> {
    @Query("Select r from Ruta r where r.nombreRuta like %:nombre%")
    public List<Ruta> buscarNombre(@Param("nombre") String nombre);
}
