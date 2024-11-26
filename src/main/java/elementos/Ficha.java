package elementos;

/*
*  Implementar CompareTo con la siguiente jerarquia:
*   Blancas > Negras
*   Rey > Reina > Alfil > Caballo > Torre > Peon
*
*   Métodos:
*       - compareTo
*       - (abstract) boolean validarMovimiento(filaOrigen, columnaOrigen, filaDestino, columnaDestino)
*       - (abstract) String obtenerRepresentacion()
*       - toString (devuelve el color y la representación)
* */

import elementos.interfaz.Color;

public abstract class Ficha implements Comparable, Color {

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
