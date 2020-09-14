package ar.uba.fi.algo3.final20200910.maderas;

public abstract class Madera {

    protected int precioKg;
    protected int cantidadKg;

    public Madera(int cantidadKg, int precioKg) {
        if (!(cantidadKg > 0))
            throw new NoSePuedeCrearMaderaSinKgException();
        this.cantidadKg = cantidadKg;
        this.precioKg = precioKg;
    }

    public int getCantidadKg() {
        return cantidadKg;
    }

    public abstract int getConsumo(int metrosCuadrados);
}
