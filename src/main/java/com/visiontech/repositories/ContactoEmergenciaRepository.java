package com.visiontech.repositories;

import com.visiontech.entities.ContactoEmergencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ContactoEmergenciaRepository extends JpaRepository<ContactoEmergencia, Integer> {
    List<ContactoEmergencia> findByNombreContainingIgnoreCase(String nombre);
}
