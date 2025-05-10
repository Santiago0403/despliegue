package com.visiontech.repositories;

import com.visiontech.entities.CondicionAtmosferica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CondicionAtmosfericaRepository extends JpaRepository<CondicionAtmosferica, Integer> {
}
