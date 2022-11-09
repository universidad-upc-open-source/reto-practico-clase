package com.universidadupc.retopracticoclase.controllers;

import com.universidadupc.retopracticoclase.entities.CentroSaludEntity;
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
    public List<CentroSaludEntity> obtenerCentrosSalud(){
        return centroSaludService.obtenerCentrosSalud();
    }

    @PostMapping()
    public CentroSaludEntity guardarCentroSalud(@RequestBody CentroSaludEntity centro){
        return centroSaludService.guardar(centro);
    }

    @GetMapping("/estado")
    public List<CentroSaludEntity> obtenerEstadoAprobado(){
        return centroSaludService.obtenerEstadoAprobado();
    }
}
