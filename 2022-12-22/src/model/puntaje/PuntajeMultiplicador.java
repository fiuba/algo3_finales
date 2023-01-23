package model.puntaje;

public class PuntajeMultiplicador extends Puntaje {

    private double factorMultiplicacion;

    public double factorMultiplicacion(){
        return this.factorMultiplicacion;
    }

    public PuntajeMultiplicador(double valor, double factorMultiplicacion) {
        this.valor = valor;
        this.factorMultiplicacion = factorMultiplicacion;
    }

    public Puntaje sumarseCon(Puntaje otroPuntaje) {
        return otroPuntaje.sumarseCon(this);
    }

    public Puntaje sumarseCon(PuntajeSimple otroPuntaje) {
        return new PuntajeMultiplicador(this.valor + otroPuntaje.valor(), this.factorMultiplicacion);
    }

    public Puntaje sumarseCon(PuntajeMultiplicador otroPuntaje) {
        return new PuntajeMultiplicador(this.valor + otroPuntaje.valor(), this.factorMultiplicacion + otroPuntaje.factorMultiplicacion());
    }

    public double calcular() {
        return (this.valor * this.factorMultiplicacion);
    }
}
