package model.caracteristica;

import model.puntaje.Puntaje;
import model.puntaje.PuntajeMultiplicador;
import model.puntaje.PuntajeSimple;

public class Capitan extends Caracteristica{

    public Capitan() {
        this.nombre = "Capitan";
    }

    public void afectar(BalonDeOro balonDeOro) {
        System.out.println("::::: Capitan es afectado por BalonDeOro, debe avisarle que el haga lo que tenga que hacer");
        balonDeOro.afectar(this);
    }

    public void afectar(Caracteristica caracteristica) {
        caracteristica.afectar(this);
    }

    @Override
    public Puntaje getPuntaje() {
        return new PuntajeSimple(0);
    }
}
