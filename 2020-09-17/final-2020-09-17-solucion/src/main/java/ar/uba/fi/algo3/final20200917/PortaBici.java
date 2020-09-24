package ar.uba.fi.algo3.final20200917;

public class PortaBici implements Cargable {
    ConjuntoCarga conjuntoCarga;

    public PortaBici() {
        conjuntoCarga = new ConjuntoCarga();
    }

    public void cargar(Helatodo carga) {
        conjuntoCarga.cargar(carga);
    }

    public void cargar(Bici carga) {
        conjuntoCarga.cargar(carga);
    }

    public Carga descargar() {
        return conjuntoCarga.descargar();
    }
}
