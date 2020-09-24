package ar.uba.fi.algo3.final20200917;

public class Ninguno extends PortaBici {

    public void cargar(Bici carga) {
        throw new NoSoportaCarga();
    }

}
