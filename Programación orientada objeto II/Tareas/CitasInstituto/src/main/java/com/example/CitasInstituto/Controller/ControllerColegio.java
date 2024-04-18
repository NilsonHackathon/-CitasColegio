package com.example.CitasInstituto.Controller;

import com.example.CitasInstituto.Model.Colegio;
import com.example.CitasInstituto.Service.IServiceColegio;
import com.example.CitasInstituto.Service.ServiceColegio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Colegio")
public class ControllerColegio {
    @Autowired
    private IServiceColegio serviceColegio;

    @GetMapping("/all")
    public ResponseEntity<List<Colegio>> getall() {
        List<Colegio> colegios = serviceColegio.getAll();
        if ((colegios.isEmpty()) || (colegios == null)) {
            return ResponseEntity.badRequest().body(colegios);
        }
        return ResponseEntity.ok(colegios);
    }

    @PostMapping("/create")
    public ResponseEntity<Colegio> create(@RequestBody Colegio colegio){
        Colegio crearColegio = serviceColegio.crearColegio(colegio);
        return ResponseEntity.ok(crearColegio);
    }

}
