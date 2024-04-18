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


    @PutMapping("/update")
    public ResponseEntity<String> update(@RequestBody Colegio colegio){
        if(colegio.getId()==null){return ResponseEntity.badRequest().body("No existe el id");
        }
        serviceColegio.update(colegio);
        return ResponseEntity.ok("Colegio actualizado");
    }

}
