package ar.uba.fi.algo3.final20200910.componentes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EstufaTest {

    @Test
    public void test01EstufaPara5ambientesY20CaloriasGasta1000() {
        int ambientes = 5;
        int calorias = 20;
        Estufa estufa = new Estufa(ambientes, calorias);

        int costoEsperado = 1000; // 5 ambientes * 20 calorias * 10 precioKw

        assertEquals(costoEsperado, estufa.getConsumo());
    }

    @Test
    public void test02EstufaPara2ambientesY10CaloriasGasta200() {
        int ambientes = 20;
        int calorias = 10;
        Estufa estufa = new Estufa(ambientes, calorias);

        int costoEsperado = 2000; // 20 ambientes * 10 calorias * 10 precioKw

        assertEquals(costoEsperado, estufa.getConsumo());
    }

    @Test
    public void test03EstufaPara0caloriasNoGastaNada() {
        int ambientes = 10;
        int calorias = 0;
        Estufa estufa = new Estufa(ambientes, calorias);

        int costoEsperado = 0; // 10 ambientes * 0 calorias * 10 precioKw

        assertEquals(costoEsperado, estufa.getConsumo());
    }
    
}
