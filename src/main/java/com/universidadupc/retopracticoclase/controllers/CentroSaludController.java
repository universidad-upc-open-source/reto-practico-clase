package com.universidadupc.retopracticoclase.controllers;

import com.universidadupc.retopracticoclase.models.CentroSaludModel;
import com.universidadupc.retopracticoclase.services.CentroSaludService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/centrosalud")
public class CentroSaludController {

    @Autowired
    CentroSaludService centroSaludService;

    @GetMapping()
    public List<CentroSaludModel> obtenerCentrosSalud(){
        return centroSaludService.obtenerCentrosSalud();
    }

    @PostMapping()
    public CentroSaludModel guardarCentroSalud(@RequestBody CentroSaludModel centro){
        return centroSaludService.guardar(centro);
    }
}
