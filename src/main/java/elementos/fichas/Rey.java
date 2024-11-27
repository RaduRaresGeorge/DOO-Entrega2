package elementos.fichas;

import elementos.Ficha;
import elementos.interfaz.TiposColor;

public class Rey extends Ficha {

    public Rey(TiposColor color){
        super(color);
    }

    @Override
    protected int getRank() {
        return 1;
    }

    @Override
    public boolean validarMovimiento(int filaOrigen, int columnaOrigen, int filaDestino, int columnaDestino) {
        return Math.abs(filaOrigen - filaDestino) <= 1 && Math.abs(columnaOrigen - columnaDestino) <= 1;
    }

    @Override
    public String obtenerRepresentacion() {
        return "K";
    }

}
