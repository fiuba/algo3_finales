package ar.uba.fi.algo3.final20200910.maderas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class QuebrachoTest {

    @Test
    public void test01QuebrachoSinKgNoSePuedeInstanciar() {
        assertThrows(NoSePuedeCrearMaderaSinKgException.class, () -> {
            new Quebracho(0);
        });
    }

    @Test
    public void test02QuebrachoSinMetrosCuadradosNoConsumeNada() {
        Quebracho quebracho = new Quebracho(2);

        assertEquals(0, quebracho.getConsumo(0));
    }

    @Test
    public void test03QuebrachoCon3kgY10metrosConsume240() {
        Quebracho quebracho = new Quebracho(3);

        int consumoEsperado = 240; // 10 * 3 * 4 * 2

        assertEquals(consumoEsperado, quebracho.getConsumo(10));
    }

    @Test
    public void test04QuebrachoCon2kgY25metrosConsume400() {
        Quebracho quebracho = new Quebracho(2);

        int consumoEsperado = 400; // 25 * 2 * 4 * 2

        assertEquals(consumoEsperado, quebracho.getConsumo(25));
    }
}
