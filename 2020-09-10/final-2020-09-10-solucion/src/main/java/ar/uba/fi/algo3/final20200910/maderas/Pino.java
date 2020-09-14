package ar.uba.fi.algo3.final20200910.maderas;

public class Pino extends Madera {

    private static final int COEFICIENTE_CALORICO = 3;
    private static final int PRECIO_KG = 2;

    public Pino(int cantidadKg) {
        super(cantidadKg, PRECIO_KG);
    }

    @Override
    public int getConsumo(int metrosCuadrados) {
        return (metrosCuadrados * cantidadKg * precioKg) / COEFICIENTE_CALORICO;
    }
}
