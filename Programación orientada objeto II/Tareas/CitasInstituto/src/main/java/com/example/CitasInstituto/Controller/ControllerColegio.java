package com.example.CitasInstituto.Controller;

import com.example.CitasInstituto.Model.Colegio;
import com.example.CitasInstituto.Service.IServiceColegio;
import com.example.CitasInstituto.Service.ServiceColegio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
