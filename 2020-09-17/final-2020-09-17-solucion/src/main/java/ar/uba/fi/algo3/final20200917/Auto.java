package ar.uba.fi.algo3.final20200917;

public class Auto implements Cargable, Equipable{
    private PortaBici equipo;

    public Auto() {
        this.equipo = new Ninguno();
    }

    @Override
    public void cargar(Helatodo carga) {
        this.equipo.cargar(carga);
    }

    @Override
    public void cargar(Bici carga) {
        this.equipo.cargar(carga);
    }

    public Carga descargar() {
        return this.equipo.descargar();
    }

    @Override
    public void equipar(PortaBici portaBici) {
        this.equipo = portaBici;
    }
}
