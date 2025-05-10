package com.visiontech.repositories;

import com.visiontech.entities.Recomendacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecomendacionRepository extends JpaRepository<Recomendacion, Integer> {
    @Query("Select r from Recomendacion r where r.comentario like %:comentario%")
    public List<Recomendacion> buscarComentario(@Param("comentario") String comentario);
}
