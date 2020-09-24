package ar.uba.fi.algo3.final20200917;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AutosTest {

    @Test
    public void autoNoPuedeDescargarCuandoNoTieneCarga() {
        Auto auto = new Auto();
        assertThrows(NadaParaDescargar.class, () -> {
            auto.descargar();
        });
    }

    @Test
    public void autoCargaYDescargaUnHelatodo() {
        Auto auto = new Auto();
        auto.cargar(new Helatodo());
        assertEquals(new Helatodo(), auto.descargar());
    }

    @Test
    public void autoNoPuedeCargarBiciSinPortaBici() {
        Auto auto = new Auto();
        assertThrows(NoSoportaCarga.class, () -> {
            auto.cargar(new Bici());
        });
    }

    @Test
    public void autoEquipadoConPortaBiciCargaYDescargaBici() {
        Auto auto = new Auto();
        auto.equipar(new PortaBici());
        auto.cargar(new Bici());
        assertEquals(new Bici(), auto.descargar());
    }

    @Test
    public void autoEquipadoConPortaBiciCargaYDescargaBiciYHelatodo() {
        Auto auto = new Auto();
        auto.equipar(new PortaBici());
        auto.cargar(new Bici());
        auto.cargar(new Helatodo());
        assertEquals(new Helatodo(), auto.descargar());
        assertEquals(new Bici(), auto.descargar());
    }
}
