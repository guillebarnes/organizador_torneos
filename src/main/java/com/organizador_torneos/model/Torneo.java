package com.organizador_torneos.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Stack;

public class Torneo {
    private LocalDateTime fecha;
    private String categoria;
    private List<Pareja> participantes = new ArrayList<>();
    private List<Grupo> grupos = new ArrayList<>();
    private List<Pareja> eliminatorias;

    public Torneo(LocalDateTime fecha, String categoria){
        this.fecha = fecha;
        this.categoria = categoria;
    }

    public LocalDateTime getFecha(){
        return this.fecha;
    }

    public List<Grupo> getGrupos(){
        return this.grupos;
    }

    public void anotarParticipantes(Pareja pareja){
        this.participantes.add(pareja);
    }

    public void armadoDeGrupos(){
        int cantidadGrupos = participantes.size() / 4;

        List<Pareja> participantesAux = participantes;

        int i = 0;

        while(i < cantidadGrupos)
        {
            int nombreGrupo = 65 + i;

            Grupo grupoNuevo = new Grupo((char)nombreGrupo);

            for(int j=0; j<4; j++)
            {
                grupoNuevo.agregarPareja(participantesAux.get(0));
                participantesAux.remove(participantesAux.get(0));
            }
            grupos.add(grupoNuevo);

            i++;
        }

        if(participantesAux.size() != 0){
            int cantGrupos = this.grupos.size();

            if(cantidadGrupos == 1){
                for(int k=0; k<participantesAux.size(); k++)
                    this.grupos.get(0).agregarPareja(participantesAux.get(k));
            }else if(cantGrupos == 2){
                switch (participantesAux.size()){
                    case 1:
                        this.grupos.get(0).agregarPareja(participantesAux.get(0));
                        break;
                    case 2:
                        this.grupos.get(0).agregarPareja(participantesAux.get(0));
                        this.grupos.get(1).agregarPareja(participantesAux.get(1));
                        break;
                    case 3:
                        this.grupos.get(0).agregarPareja(participantesAux.get(0));
                        this.grupos.get(0).agregarPareja(participantesAux.get(1));
                        this.grupos.get(1).agregarPareja(participantesAux.get(2));
                }
            }
        } else {
            int l = 0;
            while(participantesAux.size() != 0)
                this.grupos.get(l).agregarPareja(participantesAux.get(l));
        }
    }
}
