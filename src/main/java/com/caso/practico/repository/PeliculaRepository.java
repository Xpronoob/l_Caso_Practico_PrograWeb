package com.caso.practico.repository;

import com.caso.practico.entity.Pelicula;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author kevin
 */
@Repository
public interface PeliculaRepository extends CrudRepository<Pelicula, Long> {

}
