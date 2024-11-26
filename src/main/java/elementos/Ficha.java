package elementos;

/*
*  Implementar CompareTo con la siguiente jerarquia:
*   Blancas > Negras
*   Rey > Reina > Alfil > Caballo > Torre > Peon
* */

public abstract class Ficha implements Comparable {

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
