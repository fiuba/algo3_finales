## AlgoEquipos

Necesitamos desarrollar parte de un sistema para calificar equipos de futbol.
```
Sugerencia: Pensar un modelo que permita adoptar cambios cumpliendo con el mayor número de principios de diseño y/o criterios de diseño.
Ej.: Sí agregamos una nueva característica como “Campeonatos mundiales” el modelo debería poder ser extendido con “facilidad”.
```
### Descripción de un Equipo:
Es un conjunto de jugadores que pueden tener un puntaje, que resulta de sumar el puntaje individual de cada jugador.

### Descripción de un Jugador:
Representa una persona con múltiples características.

### Descripción de una Característica:
Son atributos de un jugador. Sabemos hoy que existen: (1) Edad, (2) Títulos obtenidos y (3) Balón de Oro. Cada uno de estros atributos suman:

#### Edad:
 * Suma 5 puntos, para un jugador cuya edad es de 18 a 20 años.
 * Suma 2 puntos, para un jugador cuya edad es de 20 a 30 años.
 * Fuera de estos rangos, suma conforme a sus títulos.

#### Títulos:
+ Un punto por título.

#### Balón de oro:
+ Suma 10 puntos al jugador que lo posee.

### Características excepcionales:
 + Si al menos un integrante del equipo tiene el balón de oro, esto incrementa el puntaje de sus compañeros en un %10.
 + Si el capitán del equipo tiene un balón de oro, esto duplica el puntaje de sus compañeros.

## Casos de uso:
1. Calcular el puntaje de un Jugador que tiene una Edad de 25 años y obtuvo 2 títulos.
2. Calcular el puntaje de un equipo de con los siguientes jugadores:
   - Jugador 1 Edad de 25 años y obtuvo 2 títulos.
   - Jugador 2 Edad de 18 años y obtuvo 1 títulos.
   - Jugador 3 Edad 40 años y un balón de oro.
3. Calcular el puntaje de un equipo de con los siguientes jugadores:
   - Jugador 1 Edad de 25 años y obtuvo 2 títulos.
   - Jugador 2 Edad de 18 años y obtuvo 1 títulos.
   - Jugador 3 es el capitán, tiene edad de 32 años y un balón de oro.

## Se pide:
 * Diagrama de clases (completo) que representen el modelo descrito.
 * Diagrama de secuencia para cada uno de los casos de uso.

## Notas de la posible solución presentada:
 * Pueden haber más de un capitán en un equipo (no valida eso).
 * Las características especiales aplican a todo el plantel entero.
