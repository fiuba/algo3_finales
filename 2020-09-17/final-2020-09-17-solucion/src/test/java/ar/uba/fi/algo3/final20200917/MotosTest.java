package ar.uba.fi.algo3.final20200917;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MotosTest {

    @Test
    public void motoNoPuedeDescargarCuandoNoTieneCarga() {
        Moto moto = new Moto();
        assertThrows(NadaParaDescargar.class, () -> {
            moto.descargar();
        });
    }

    @Test
    public void motoCargaYDescargaUnHelatodo() {
        Moto moto = new Moto();
        moto.cargar(new Helatodo());
        assertEquals(new Helatodo(), moto.descargar());
    }

    @Test
    public void motoNoPuedeCargarBici() {
        Moto moto = new Moto();
        assertThrows(NoSoportaCarga.class, () -> {
            moto.cargar(new Bici());
        });
    }

}
