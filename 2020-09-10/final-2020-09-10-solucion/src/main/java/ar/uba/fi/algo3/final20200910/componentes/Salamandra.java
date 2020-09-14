package ar.uba.fi.algo3.final20200910.componentes;

import ar.uba.fi.algo3.final20200910.maderas.Madera;

import java.util.ArrayList;
import java.util.List;

public class Salamandra implements Componente {
    private static final int CAPACIDAD_MAXIMA = 15;
    private final int metrosCuadrados;
    private List<Madera> maderas = new ArrayList<>();

    public Salamandra(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    @Override
    public int getConsumo() {
        return maderas.stream().mapToInt(madera -> madera.getConsumo(metrosCuadrados)).sum();
    }

    public void agregarMadera(Madera madera) {
        if (madera.getCantidadKg() + cantidadKgMaderas() > CAPACIDAD_MAXIMA)
            throw new CapacidadMaximaDeMaderaExcedidaException();
        maderas.add(madera);
    }

    private int cantidadKgMaderas() {
        return maderas.stream().mapToInt(Madera::getCantidadKg).sum();
    }
}
