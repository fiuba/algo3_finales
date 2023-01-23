package model.caracteristica;

import model.Puntuable;
import model.puntaje.Puntaje;

public abstract class Caracteristica implements Puntuable, Afectable {
    protected String nombre;

    public void afectar(Edad edad) {
        //System.out.println("Caracteristica es afectada por edad");
    }

    public void afectar(Titulo titulo) {
        //System.out.println("Caracteristica es afectada por titulo");
    }
    public void afectar(BalonDeOro balonDeOro) {
        //System.out.println("Caracteristica es afectada por balonDeOro");
    }

    public void afectar(Capitan capitan) {
        //System.out.println("Caracteristica es afectada por capitan");
    }
}
