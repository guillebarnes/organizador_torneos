package com.organizador_torneos.model;

public class Jugador {
    private String nombre;
    private int dni;
    private String posicion;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getPosicion(){
        return posicion;
    }

    public void setPosicion(String posicion){
        this.posicion = posicion;
    }
}