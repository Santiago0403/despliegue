package com.visiontech.repositories;

import com.visiontech.entities.TemaForo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemaForoRepository extends JpaRepository<TemaForo, Integer> {
}
