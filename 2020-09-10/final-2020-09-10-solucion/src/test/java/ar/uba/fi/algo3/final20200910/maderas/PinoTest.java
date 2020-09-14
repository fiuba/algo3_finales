package ar.uba.fi.algo3.final20200910.maderas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PinoTest {

    @Test
    public void test01PinoSinKgNoSePuedeInstanciar() {
        assertThrows(NoSePuedeCrearMaderaSinKgException.class, () -> {
            new Pino(0);
        });
    }

    @Test
    public void test02PinoSinMetrosCuadradosNoConsumeNada() {
        Pino pino = new Pino(2);

        assertEquals(0, pino.getConsumo(0));
    }

    @Test
    public void test03PinoCon3kgY20metrosConsume40() {
        Pino pino = new Pino(3);

        int consumoEsperado = 40; // 20 * 3 * 2 / 3

        assertEquals(consumoEsperado, pino.getConsumo(20));
    }

    @Test
    public void test04PinoCon2kgY25metrosConsume33() {
        Pino pino = new Pino(2);

        int consumoEsperado = 33; // 25 * 2 * 2 / 3

        assertEquals(consumoEsperado, pino.getConsumo(25));
    }
}
