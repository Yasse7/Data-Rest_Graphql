package com.example.SPRINGDATAREST_.GRAPHQL.Repositories;

import com.example.SPRINGDATAREST_.GRAPHQL.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
}
