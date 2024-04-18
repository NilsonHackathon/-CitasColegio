package com.example.CitasInstituto.Service;

import com.example.CitasInstituto.Model.Colegio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServiceColegio {
    public List<Colegio> getAll();

    Colegio crearColegio(Colegio colegio);

    void borrarColegio(Integer id);
}
