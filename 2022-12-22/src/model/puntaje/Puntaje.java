package model.puntaje;

import model.Puntuable;

public abstract class Puntaje implements Calculable {
    protected double valor;

    public double valor() {
        return valor;
    }

    public abstract Puntaje sumarseCon(Puntaje otroPuntaje);

    public abstract Puntaje sumarseCon(PuntajeSimple otroPuntaje);

    public abstract Puntaje sumarseCon(PuntajeMultiplicador otroPuntaje);
}