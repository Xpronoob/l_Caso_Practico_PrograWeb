package com.caso.practico.controller;

import com.caso.practico.entity.Pelicula;
import com.caso.practico.entity.Sala;
import com.caso.practico.service.IPeliculaService;
import com.caso.practico.service.ISalaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author kevin alonso marin aguilar
 */
@Controller
public class CinelitasController {

    @Autowired
    private IPeliculaService peliculaService;

    @Autowired
    private ISalaService salaService;

    @GetMapping("/pelicula")
    public String index(Model model) {
        List<Pelicula> listaPelicula = peliculaService.getAllPelicula();
        model.addAttribute("titulo", "Tabla Peliculas");
        model.addAttribute("peliculas", listaPelicula);
        return "peliculas";
    }

    @GetMapping("/peliculaN")
    public String crearPelicula(Model model) {
        List<Sala> listaSalas = salaService.listSala();
        model.addAttribute("pelicula", new Pelicula());
        model.addAttribute("salas", listaSalas);
        return "crear";
    }

    @PostMapping("/save")
    public String guardarPelicula(@ModelAttribute Pelicula pelicula) {
        peliculaService.savePelicula(pelicula);
        return "redirect:/pelicula";
    }

    @GetMapping("/delete/{id}")
    public String eliminarPelicula(@PathVariable("id") Long idPelicula) {
        peliculaService.delete(idPelicula);
        return "redirect:/pelicula";
    }

    @GetMapping("/editPelicula/{id}")
    public String editarPelicula(@PathVariable("id") Long idPelicula, Model model) {
        Pelicula pelicula = peliculaService.getPeliculaByID(idPelicula);
        List<Sala> listaSalas = salaService.listSala();
        model.addAttribute("pelicula", pelicula);
        model.addAttribute("salas", listaSalas);
        return "crear";
    }
}
