package com.caso.practico.service;

import com.caso.practico.entity.Pelicula;
import com.caso.practico.repository.PeliculaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author kevin
 */
@Service
public class PeliculaService implements IPeliculaService {

    @Autowired
    private PeliculaRepository peliculaRepository;

    @Override
    public List<Pelicula> getAllPelicula() {
        return (List<Pelicula>) peliculaRepository.findAll();
    }

    @Override
    public Pelicula getPeliculaByID(long id) {
        return peliculaRepository.findById(id).orElse(null);
    }

    @Override
    public void savePelicula(Pelicula pelicula) {
        peliculaRepository.save(pelicula);
    }

    @Override
    public void delete(long id) {
        peliculaRepository.deleteById(id);
    }
}
