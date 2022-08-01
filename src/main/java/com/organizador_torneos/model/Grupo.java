package com.organizador_torneos.model;

import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private char nombre;
    private List<Pareja> parejas = new ArrayList<>();
    private List<Partido> partidos;
    private List<Pareja> ganadores;

    public Grupo(char nombre) {
        this.nombre = nombre;
    }

    public char getNombre() {
        return nombre;
    }

    public void agregarPareja(Pareja pareja){
        this.parejas.add(pareja);
    }

    public int parejas(){
        return parejas.size();
    }
}
