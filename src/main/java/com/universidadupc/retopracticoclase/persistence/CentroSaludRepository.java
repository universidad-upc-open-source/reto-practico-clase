package com.universidadupc.retopracticoclase.persistence;

import com.universidadupc.retopracticoclase.persistence.crud.CentroSaludCrudRepositoryInterface;
import com.universidadupc.retopracticoclase.persistence.entity.CentroSalud;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Esta clase se encarga de interactuar con la base de datos,
 * desde aquí se hacen operaciones sobre las tablas
 */
@Repository
public class CentroSaludRepository {
    private CentroSaludCrudRepositoryInterface centroSaludCrudRepositoryInterface;

    public List<CentroSalud> getAll(){
        return (List<CentroSalud>) centroSaludCrudRepositoryInterface.findAll();
    };

    public List<CentroSalud> getByTipo(String tipo){
        return centroSaludCrudRepositoryInterface.findByTipo(tipo);
    }

    public Optional<CentroSalud> getCentroSalud(Long codigo){
        return Optional.ofNullable(centroSaludCrudRepositoryInterface.findByCodigo(codigo));
    }

    public Boolean getStatusApprove(Long codigo){
        boolean status = false;
        CentroSalud centro = centroSaludCrudRepositoryInterface.findByCodigo(codigo);
        double calificacion = centro.getCalificacionInfraestructura() * 0.35 + centro.getCalificacionServicios() * 0.65;

        if (calificacion >= 80) {
            status = true;
        }
        return status;
    }
    public CentroSalud save(CentroSalud centroSalud) {
        return centroSaludCrudRepositoryInterface.save(centroSalud);
    }

    public void delete(Long codigo){
        centroSaludCrudRepositoryInterface.deleteById(codigo);
    }
}
