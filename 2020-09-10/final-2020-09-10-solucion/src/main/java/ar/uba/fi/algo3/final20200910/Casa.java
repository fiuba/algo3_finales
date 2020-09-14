package ar.uba.fi.algo3.final20200910;

import ar.uba.fi.algo3.final20200910.componentes.Componente;

import java.util.ArrayList;
import java.util.List;

public class Casa {
    private List<Componente> componentes = new ArrayList<>();

    public void agregarComponente(Componente componente) {
        componentes.add(componente);
    }

    public int getGastoTotal() {
        return componentes.stream().mapToInt(Componente::getConsumo).sum();
    }
}
