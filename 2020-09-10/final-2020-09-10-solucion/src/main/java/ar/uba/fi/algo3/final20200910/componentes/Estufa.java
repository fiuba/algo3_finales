package ar.uba.fi.algo3.final20200910.componentes;

public class Estufa implements Componente {

    private static final int PRECIO_KW = 10;
    private int ambientes;
    private int calorias;

    public Estufa(int ambientes, int calorias) {
        this.ambientes = ambientes;
        this.calorias = calorias;
    }

    @Override
    public int getConsumo() {
        return ambientes * PRECIO_KW * calorias;
    }
}
