package com.universidadupc.retopracticoclase.domain.repository;

import com.universidadupc.retopracticoclase.domain.CentroSalud;

import java.util.List;
import java.util.Optional;

/**
 * Indica a todos los repositorios, cómo se deben de comportar cuando
 * interactúen con centros de salud
 */
public interface CentroSaludRepositoryInterface {
    List<CentroSalud> getAll();
    Optional<List<CentroSalud>> getByTipo(String tipo);
}
