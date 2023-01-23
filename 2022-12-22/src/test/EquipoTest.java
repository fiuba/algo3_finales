package test;

import model.Equipo;
import model.Jugador;
import model.caracteristica.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EquipoTest {

    Equipo equipo;

    @BeforeEach
    void setUp() {
        equipo = new Equipo("Algoneta");

        Caracteristica edad = new Edad(25);
        Caracteristica unTitulo = new Titulo("Libetadores");
        Caracteristica otroTitulo = new Titulo("Copa Argentina");

        Jugador unJugador = new Jugador("Pablo");
        unJugador.agregarCaracteristica(edad);
        unJugador.agregarCaracteristica(unTitulo);
        unJugador.agregarCaracteristica(otroTitulo);

        Jugador otroJugador = new Jugador("Matias");
        Caracteristica otraEdad = new Edad(18);
        otroJugador.agregarCaracteristica(otraEdad);
        otroJugador.agregarCaracteristica(unTitulo);

        equipo.agregarJugador(unJugador);
        equipo.agregarJugador(otroJugador);
    }

    @Test
    @DisplayName("Puntaje equipo caso de uso 2")
    void testEquipoCaso2DeberiaTener22Puntos() {

        Jugador jugador3 = new Jugador("Carlos");
        jugador3.agregarCaracteristica(new Edad(40));
        jugador3.agregarCaracteristica(new BalonDeOro());
        equipo.agregarJugador(jugador3);

        assertEquals(22, equipo.getPuntaje().calcular(),"Puntaje deberia ser 22");
    }

    @Test
    @DisplayName("Puntaje equipo caso de uso 3")
    void testEquipoCaso3DeberiaTener40Puntos() {

        Jugador jugador3 = new Jugador("Carlos");
        jugador3.agregarCaracteristica(new Capitan());
        jugador3.agregarCaracteristica(new Edad(32));
        jugador3.agregarCaracteristica(new BalonDeOro());

        equipo.agregarJugador(jugador3);

        assertEquals(40, equipo.getPuntaje().calcular(),"Puntaje deberia ser 40");
    }

    @Test
    @DisplayName("Puntaje equipo caso de uso 3 distinto orden de creacion")
    void testEquipoCaso3DeberiaTener40PuntosSinImportarOrdenDeAgregacionCaracteristicas() {

        Jugador jugador3 = new Jugador("Carlos");
        jugador3.agregarCaracteristica(new Edad(32));
        jugador3.agregarCaracteristica(new BalonDeOro());
        jugador3.agregarCaracteristica(new Capitan());

        equipo.agregarJugador(jugador3);

        assertEquals(40, equipo.getPuntaje().calcular(),"Puntaje deberia ser 40");
    }
}