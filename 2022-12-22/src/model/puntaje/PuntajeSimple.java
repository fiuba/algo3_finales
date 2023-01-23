package model.puntaje;

public class PuntajeSimple extends Puntaje{

    public PuntajeSimple(double valor){
        this.valor = valor;
    }

    public Puntaje sumarseCon(Puntaje otroPuntaje) {
        return otroPuntaje.sumarseCon(this);
    }

    public Puntaje sumarseCon(PuntajeSimple otroPuntaje){
        return new PuntajeSimple(this.valor + otroPuntaje.valor());
    }

    public Puntaje sumarseCon(PuntajeMultiplicador otroPuntaje){
        return new PuntajeMultiplicador(this.valor + otroPuntaje.valor(), otroPuntaje.factorMultiplicacion());
    }

    public double calcular() {
        return this.valor();
    }
}
