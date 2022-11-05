package com.universidadupc.retopracticoclase.persistence.crud;

import com.universidadupc.retopracticoclase.persistence.entity.CentroSalud;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CentroSaludCrudRepositoryInterface extends CrudRepository<CentroSalud, Long> {

    List<CentroSalud> findByTipo(String tipo);
    CentroSalud findByCodigo(Long codigo);
}
