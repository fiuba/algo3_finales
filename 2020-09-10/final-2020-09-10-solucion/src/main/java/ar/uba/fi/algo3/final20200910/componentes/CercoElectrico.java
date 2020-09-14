package ar.uba.fi.algo3.final20200910.componentes;

public class CercoElectrico implements Componente {
    private final int metros;
    private final int PRECIO_KW = 10;

    public CercoElectrico(int metros) {
        this.metros = metros;
    }

    @Override
    public int getConsumo() {
        return metros * PRECIO_KW;
    }
}
