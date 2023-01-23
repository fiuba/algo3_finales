package model.caracteristica;

import model.puntaje.Puntaje;
import model.puntaje.PuntajeMultiplicador;
import model.puntaje.PuntajeSimple;

public class BalonDeOro extends Caracteristica {

    private double intensificador = 1.1;

    public BalonDeOro() {
        this.nombre = "Balon de oro";
    }

    public void afectar(Capitan capitan) {
        System.out.println("::::: Balon de oro es afectado por Capitan, debe duplicar el puntaje");
        this.intensificador = 2;
    }

    public void afectar(Caracteristica caracteristica) {
        caracteristica.afectar(this);
    }

    @Override
    public Puntaje getPuntaje() {
        return new PuntajeMultiplicador(10, intensificador);
    }
}
