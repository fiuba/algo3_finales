package ar.uba.fi.algo3.final20200917;

public class Moto implements Cargable {
    private final ConjuntoCarga conjuntoCarga;

    public Moto() {
        this.conjuntoCarga = new ConjuntoCarga();
    }

    @Override
    public void cargar(Bici carga) {
        throw new NoSoportaCarga();
    }

    @Override
    public void cargar(Helatodo carga) {
        this.conjuntoCarga.cargar(carga);
    }

    public Carga descargar() {
        return this.conjuntoCarga.descargar();
    }
}
