package com.universidadupc.retopracticoclase.repositories;

import com.universidadupc.retopracticoclase.models.CentroSaludModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CentroSaludRepository extends CrudRepository<CentroSaludModel, Long> {
    List<CentroSaludModel> findByTipo(String tipo);
    CentroSaludModel findByCodigo(Long codigo);
}
