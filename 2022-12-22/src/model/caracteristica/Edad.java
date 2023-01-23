package model.caracteristica;

import model.puntaje.Puntaje;
import model.puntaje.PuntajeSimple;

public class Edad extends Caracteristica {

    private int edad;

    public Edad(int edad) {
        this.nombre = "Edad";
        this.edad = edad;
    }

    @Override
    public Puntaje getPuntaje() {
        if (this.edad >= 18 && this.edad <= 20) {
            return new PuntajeSimple(5);
        }

        if (this.edad >= 21 && this.edad <= 30) {
            return new PuntajeSimple(2);
        }

        return new PuntajeSimple(0);
    }

    public void afectar(Caracteristica caracteristica) {
        caracteristica.afectar(this);
    }
}
