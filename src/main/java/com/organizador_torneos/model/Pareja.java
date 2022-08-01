package com.organizador_torneos.model;

import java.util.ArrayList;
import java.util.List;

public class Pareja {
    private List<Jugador> jugadores = new ArrayList<>();

    public Pareja() {

    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(Jugador jugador1, Jugador jugador2) {
        jugadores.add(jugador1);
        jugadores.add(jugador2);
    }
}

