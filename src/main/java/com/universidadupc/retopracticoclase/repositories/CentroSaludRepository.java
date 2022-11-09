package com.universidadupc.retopracticoclase.repositories;

import com.universidadupc.retopracticoclase.entities.CentroSaludEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CentroSaludRepository extends CrudRepository<CentroSaludEntity, Long> {
    List<CentroSaludEntity> findByTipo(String tipo);
    CentroSaludEntity findByCodigo(Long codigo);
}
