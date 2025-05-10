package com.visiontech.repositories;

import com.visiontech.entities.NumeroEmergencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NumeroEmergenciaRepository extends JpaRepository<NumeroEmergencia,Integer> {

}
