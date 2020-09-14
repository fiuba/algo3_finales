package ar.uba.fi.algo3.final20200910.maderas;

public class Quebracho extends Madera {

    private static final int PUREZA = 2;
    private static final int PRECIO_KG = 4;

    public Quebracho(int cantidadKg) {
        super(cantidadKg, PRECIO_KG);
    }

    @Override
    public int getConsumo(int metrosCuadrados) {
        return metrosCuadrados * cantidadKg * precioKg * PUREZA;
    }
}
