package elementos.fichas;

import elementos.Ficha;
import elementos.interfaz.TiposColor;

public class Peon extends Ficha {

    public Peon(TiposColor color){
        super(color);
    }

    @Override
    protected int getRank() {
        return 6;
    }

    @Override
    public boolean validarMovimiento(int filaOrigen, int columnaOrigen, int filaDestino, int columnaDestino) {
        if (this.getColor() == TiposColor.BLANCO) {
            return (filaOrigen - filaDestino == 1 && columnaOrigen == columnaDestino) ||
                   (filaOrigen - filaDestino == 1 && Math.abs(columnaOrigen - columnaDestino) == 1);
        } else {
            return (filaOrigen - filaDestino == -1 && columnaOrigen == columnaDestino) ||
                   (filaOrigen - filaDestino == -1 && Math.abs(columnaOrigen - columnaDestino) == 1);
        }
    }

    @Override
    public String obtenerRepresentacion() {
        return "P";
    }

}
