package model;

import model.caracteristica.Caracteristica;
import model.puntaje.Puntaje;
import model.puntaje.PuntajeSimple;

import java.util.ArrayList;
import java.util.Collection;

public class Equipo implements Puntuable{

    private String nombre;

    private Collection<Jugador> jugadores = new ArrayList();

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public void agregarJugador(Jugador jugador) {
        this.jugadores.add(jugador);
    }


    @Override
    public Puntaje getPuntaje() {
        Puntaje puntajeFinal =  new PuntajeSimple(0);
        for(Jugador jugador : jugadores) {
            puntajeFinal = puntajeFinal.sumarseCon(jugador.getPuntaje());
        }
        return puntajeFinal;
    }
}
