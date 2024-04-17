package com.example.CitasInstituto.Repository;

import com.example.CitasInstituto.Model.Colegio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepoColegio extends JpaRepository<Colegio, Integer> {
}
