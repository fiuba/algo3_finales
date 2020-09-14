package ar.uba.fi.algo3.final20200910.componentes;

public class LosaRadiante implements Componente {
    private final int metros;
    private final int PRECIO_KW = 10;

    public LosaRadiante(int metros) {
        this.metros = metros;
    }

    @Override
    public int getConsumo() {
        return PRECIO_KW * metros * metros;
    }
}
