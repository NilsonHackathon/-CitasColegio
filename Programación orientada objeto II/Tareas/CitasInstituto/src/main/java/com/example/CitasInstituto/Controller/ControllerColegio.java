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
    public ResponseEntity<List<Colegio>> getAll() {
        List<Colegio> colegios = serviceColegio.getAll();
        return ResponseEntity.ok(colegios);
    }

    @PostMapping("/create")
    public ResponseEntity<Colegio> create(@RequestBody Colegio colegio){
        Colegio crearColegio = serviceColegio.crearColegio(colegio);
        return ResponseEntity.ok(crearColegio);
    }
    @PutMapping ("/update")
    public ResponseEntity<Colegio> update(@RequestBody Colegio colegio){
        Colegio crearColegio = serviceColegio.crearColegio(colegio);
        return ResponseEntity.ok(crearColegio);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Integer id ) {
        serviceColegio.borrarColegio(id);
        return ResponseEntity.ok("atrevete vete salte del closed destapate quitate el esmalte, deja taparte, que nadie va a retratarte, levantate ponte jalpe");
    }


}
