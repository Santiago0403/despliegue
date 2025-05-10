package com.visiontech.repositories;

import com.visiontech.entities.Metrica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetricaRepository extends JpaRepository<Metrica,Integer> {
}
