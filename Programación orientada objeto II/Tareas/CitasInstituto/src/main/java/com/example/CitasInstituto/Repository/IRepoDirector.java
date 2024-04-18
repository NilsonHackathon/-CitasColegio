package com.example.CitasInstituto.Repository;

import com.example.CitasInstituto.Model.Director;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepoDirector extends JpaRepository<Director, Integer> {
}
