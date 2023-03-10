/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.caso.practico.service;

import com.caso.practico.entity.Sala;
import com.caso.practico.repository.SalaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author kevin
 */
@Service
public class SalaService implements ISalaService {

    @Autowired
    private SalaRepository salaRepository;

    @Override
    public List<Sala> listSala() {
        return (List<Sala>) salaRepository.findAll();
    }
}
