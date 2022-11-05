package com.universidadupc.retopracticoclase.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CentroSaludController {
    @GetMapping("centros")
    public String getCentros(){
        return "centros de salud";
    }
}
