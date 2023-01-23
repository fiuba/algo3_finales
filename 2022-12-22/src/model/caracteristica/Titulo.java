package model.caracteristica;

import model.puntaje.Puntaje;
import model.puntaje.PuntajeSimple;

public class Titulo extends Caracteristica{

    private String titulo;

    public Titulo(String titulo) {
        this.nombre = "Titulo";
        this.titulo = titulo;
    }

    public void afectar(Caracteristica caracteristica) {
        caracteristica.afectar(this);
    }

    @Override
    public Puntaje getPuntaje() {
        return new PuntajeSimple(1);
    }
}
