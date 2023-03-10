package com.caso.practico.service;

import com.caso.practico.entity.Pelicula;
import java.util.List;

/**
 *
 * @author kevin
 */
public interface IPeliculaService {

    public List<Pelicula> getAllPelicula();

    public Pelicula getPeliculaByID(long id);

    public void savePelicula(Pelicula pelicula);

    public void delete(long id);
}
