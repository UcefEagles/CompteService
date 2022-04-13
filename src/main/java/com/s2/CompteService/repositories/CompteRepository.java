package com.s2.CompteService.repositories;

import com.s2.CompteService.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte,Long> {
}
