package ar.uba.fi.algo3.final20200910.componentes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LosaRadianteTest {

    @Test
    public void test01LosaRadiantePara5metrosGasta250() {
        int metrosCuadrados = 5;
        LosaRadiante losaRadiante = new LosaRadiante(metrosCuadrados);

        int costoEsperado = 250; // 5 metros * 5 metros * 10 precioKw

        assertEquals(costoEsperado, losaRadiante.getConsumo());
    }

    @Test
    public void test02LosaRadiantePara20metrosGasta4000() {
        int metrosCuadrados = 20;
        LosaRadiante losaRadiante = new LosaRadiante(metrosCuadrados);

        int costoEsperado = 4000; // 20 metros * 20 metros * 10 precioKw

        assertEquals(costoEsperado, losaRadiante.getConsumo());
    }

    @Test
    public void test03LosaRadiantePara0metrosNoGastaNada() {
        int metrosCuadrados = 0;
        LosaRadiante losaRadiante = new LosaRadiante(metrosCuadrados);

        int costoEsperado = 0; // 0 metros * 0 metros * 10 precioKw

        assertEquals(costoEsperado, losaRadiante.getConsumo());
    }
    
}
