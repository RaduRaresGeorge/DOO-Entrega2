package elementos;

import elementos.interfaz.Color;
import elementos.interfaz.TiposColor;

import java.io.Serial;
import java.io.Serializable;

public abstract class Ficha implements Comparable<Ficha>, Color, Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private TiposColor color;

    public Ficha(TiposColor color) {
        this.color = color;
    }

    public TiposColor getColor() {
        return color;
    }

    public void setColor(TiposColor color) {
        this.color = color;
    }

    @Override
    public int compareTo(Ficha otraFicha) {
        if (this.color != otraFicha.color){
            return this.color == TiposColor.BLANCO ? 1 : -1;
        }
        return Integer.compare(this.getRank(), otraFicha.getRank());
    }

    protected abstract int getRank();

    public abstract boolean validarMovimiento(int filaOrigen, int columnaOrigen, int filaDestino, int columnaDestino);
    public abstract String obtenerRepresentacion();

    @Override
    public String toString() {
        return this.color + " " + this.obtenerRepresentacion();
    }

}
