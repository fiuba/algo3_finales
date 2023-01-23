package test;

import model.Jugador;
import model.caracteristica.Caracteristica;
import model.caracteristica.Edad;
import model.caracteristica.Titulo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JugadorTest {

    Jugador jugador;

    @BeforeEach
    void setUp() {
        jugador = new Jugador("Pablo");
    }

    @Test
    @DisplayName("Puntaje Jugador con caracteristicas ")
    void testJugadorDe25Aniosy2TitulosDeberiaTener4Puntos() {

        Caracteristica edad = new Edad(25);
        Caracteristica unTitulo = new Titulo("Libetadores");
        Caracteristica otroTitulo = new Titulo("Copa Argentina");

        jugador.agregarCaracteristica(edad);
        jugador.agregarCaracteristica(unTitulo);
        jugador.agregarCaracteristica(otroTitulo);

        assertEquals(4, jugador.getPuntaje().calcular(),"Puntaje deberia ser 4");
    }
}