package model;

import model.caracteristica.Caracteristica;
import model.puntaje.Puntaje;
import model.puntaje.PuntajeSimple;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;

public class Jugador implements Puntuable{

    private String nombre;

    private Collection<Caracteristica> caracteristicas = new ArrayList();

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public void agregarCaracteristica(Caracteristica nuevaCaracteristica) {
        for(Caracteristica caracteristica : caracteristicas) {
            caracteristica.afectar(nuevaCaracteristica);
        }
        this.caracteristicas.add(nuevaCaracteristica);
    }


    @Override
    public Puntaje getPuntaje() {
        Puntaje puntajeFinal =  new PuntajeSimple(0);
        for(Caracteristica caracteristica : caracteristicas) {
            puntajeFinal = puntajeFinal.sumarseCon(caracteristica.getPuntaje());
        }
        return puntajeFinal;
    }
}
