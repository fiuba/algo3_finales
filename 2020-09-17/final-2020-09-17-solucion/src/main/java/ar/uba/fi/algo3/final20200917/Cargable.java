package ar.uba.fi.algo3.final20200917;

public interface Cargable {

    void cargar(Bici carga);

    void cargar(Helatodo carga);

    Carga descargar();
}
