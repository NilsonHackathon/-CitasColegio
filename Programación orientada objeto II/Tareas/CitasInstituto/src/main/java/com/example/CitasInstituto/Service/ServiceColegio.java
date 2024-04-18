package com.example.CitasInstituto.Service;

import com.example.CitasInstituto.Model.Colegio;
import com.example.CitasInstituto.Repository.IRepoColegio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceColegio implements IServiceColegio {

    @Autowired
    private IRepoColegio repoColegio;

    @Override
    public List<Colegio> getAll() {
        return repoColegio.findAll();
    }

    @Override
    public Colegio crearColegio(Colegio colegio) {repoColegio.save(colegio);
        return colegio;
    }

    public void borrarColegio(Integer id){
        repoColegio.deleteById(id);
    };


}