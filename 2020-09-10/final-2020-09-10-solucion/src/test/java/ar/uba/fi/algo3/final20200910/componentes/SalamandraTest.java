package ar.uba.fi.algo3.final20200910.componentes;

import ar.uba.fi.algo3.final20200910.maderas.Pino;
import ar.uba.fi.algo3.final20200910.maderas.Quebracho;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SalamandraTest {

    @Test
    public void test01SalamandraCon2kgDeQuebrachoGasta80() {
        int metrosCuadrados = 5;
        Salamandra salamandra = new Salamandra(metrosCuadrados);

        int cantidadKg = 2;
        Quebracho quebracho2kg = new Quebracho(cantidadKg);

        salamandra.agregarMadera(quebracho2kg);

        int costoEsperado = 80; // 5 metros * 2 kg * 4 precioKg * 2 pureza

        assertEquals(costoEsperado, salamandra.getConsumo());
    }

    @Test
    public void test02SalamandraCon5kgDeQuebrachoGasta200() {
        int metrosCuadrados = 5;
        Salamandra salamandra = new Salamandra(metrosCuadrados);

        int cantidadKg = 5;
        Quebracho quebracho2kg = new Quebracho(cantidadKg);

        salamandra.agregarMadera(quebracho2kg);

        int costoEsperado = 200; // 5 metros * 5 kg * 4 precioKg * 2 pureza

        assertEquals(costoEsperado, salamandra.getConsumo());
    }

    @Test
    public void test03SalamandraCon2kgDePinoGasta6() {
        int metrosCuadrados = 5;
        Salamandra salamandra = new Salamandra(metrosCuadrados);

        int cantidadKg = 2;
        Pino pino2kg = new Pino(cantidadKg);

        salamandra.agregarMadera(pino2kg);

        int costoEsperado = 6; // 5 metros * 2 kg * 2 precioKg / 3 coeficiente

        assertEquals(costoEsperado, salamandra.getConsumo());
    }

    @Test
    public void test04SalamandraCon6kgDeQuebrachoY3kgDePinoGasta200() {
        int metrosCuadrados = 6;
        Salamandra salamandra = new Salamandra(metrosCuadrados);

        Quebracho quebracho6kg = new Quebracho(6);
        salamandra.agregarMadera(quebracho6kg);

        Pino pino2kg = new Pino(3);
        salamandra.agregarMadera(pino2kg);

        int costoEsperado = 300; // 6 metros * 6 kg * 4 precioKg * 2 pureza + 6 metros * 3 kg * 2 precioKg / 3 coef

        assertEquals(costoEsperado, salamandra.getConsumo());
    }

    @Test
    public void test05SalamandraNoPuedeExceder15kgDeQuebracho() {
        Salamandra salamandra = new Salamandra(6);

        Quebracho quebracho16kg = new Quebracho(16);

        assertThrows(CapacidadMaximaDeMaderaExcedidaException.class, () -> {
            salamandra.agregarMadera(quebracho16kg);
        });
    }

    @Test
    public void test06SalamandraNoPuedeExceder15kgDePino() {
        Salamandra salamandra = new Salamandra(6);

        Pino pino16kg = new Pino(16);

        assertThrows(CapacidadMaximaDeMaderaExcedidaException.class, () -> {
            salamandra.agregarMadera(pino16kg);
        });
    }

    @Test
    public void test07SalamandraNoPuedeExceder15kgDeMaderaEnGeneral() {
        Salamandra salamandra = new Salamandra(6);

        Quebracho quebracho8kg = new Quebracho(8);

        salamandra.agregarMadera(quebracho8kg);

        Pino pino2kg = new Pino(8);

        assertThrows(CapacidadMaximaDeMaderaExcedidaException.class, () -> {
            salamandra.agregarMadera(pino2kg);
        });
    }
}
