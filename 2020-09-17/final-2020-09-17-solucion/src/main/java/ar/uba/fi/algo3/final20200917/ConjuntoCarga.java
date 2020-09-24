package ar.uba.fi.algo3.final20200917;

import java.util.Stack;

public class ConjuntoCarga implements Cargable {
    Stack<Carga> cargas;

    ConjuntoCarga() {
        cargas = new Stack<>();
    }

    @Override
    public void cargar(Bici carga) {
        this.cargas.push(carga);
    }

    @Override
    public void cargar(Helatodo carga) {
        this.cargas.push(carga);
    }

    @Override
    public Carga descargar() {
        if (cargas.empty())
            throw new NadaParaDescargar();
        return cargas.pop();
    }
}


