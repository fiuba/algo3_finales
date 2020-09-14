package ar.uba.fi.algo3.final20200910.componentes;

import ar.uba.fi.algo3.final20200910.maderas.Pino;
import ar.uba.fi.algo3.final20200910.maderas.Quebracho;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CercoElectricoTest {

    @Test
    public void test01CercoElectricoPara5metrosGasta50() {
        int metrosCuadrados = 5;
        CercoElectrico cercoElectrico = new CercoElectrico(metrosCuadrados);

        int costoEsperado = 50; // 5 metros * 10 precioKw

        assertEquals(costoEsperado, cercoElectrico.getConsumo());
    }

    @Test
    public void test02CercoElectricoPara20metrosGasta200() {
        int metrosCuadrados = 20;
        CercoElectrico cercoElectrico = new CercoElectrico(metrosCuadrados);

        int costoEsperado = 200; // 20 metros * 10 precioKw

        assertEquals(costoEsperado, cercoElectrico.getConsumo());
    }

    @Test
    public void test03CercoElectricoPara0metrosNoGastaNada() {
        int metrosCuadrados = 0;
        CercoElectrico cercoElectrico = new CercoElectrico(metrosCuadrados);

        int costoEsperado = 0; // 0 metros * 10 precioKw

        assertEquals(costoEsperado, cercoElectrico.getConsumo());
    }

}
