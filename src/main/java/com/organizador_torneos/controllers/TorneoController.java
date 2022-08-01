package com.organizador_torneos.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TorneoController {

    @RequestMapping(value = "prueba")
    public List<String> prueba(){
        return List.of("Pelota", "Paleta", "Cancha");
    }
}
