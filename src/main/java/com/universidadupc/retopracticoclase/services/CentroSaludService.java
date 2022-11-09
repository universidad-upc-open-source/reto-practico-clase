package com.universidadupc.retopracticoclase.services;

import com.universidadupc.retopracticoclase.entities.CentroSaludEntity;
import com.universidadupc.retopracticoclase.repositories.CentroSaludRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Contiene la lógica de negocio
 */
@Service
public class CentroSaludService {
    @Autowired
    CentroSaludRepository centroSaludRepository;

    public List<CentroSaludEntity> obtenerCentrosSalud(){
        return (List<CentroSaludEntity>) centroSaludRepository.findAll();
    }

    public CentroSaludEntity guardar(CentroSaludEntity centro){
        return centroSaludRepository.save(centro);
    }

    public Boolean obtenerEstadoAprobado(Long codigo){
        boolean status = false;
        CentroSaludEntity centro = centroSaludRepository.findByCodigo(codigo);
        double calificacion = centro.getCalificacionInfraestructura() * 0.35 + centro.getCalificacionServicios() * 0.65;

        if (calificacion >= 80) {
            status = true;
        }
        return status;
    }



}
