package elementos.fichas;

import elementos.Ficha;
import elementos.interfaz.TiposColor;

public class Alfil extends Ficha {

    public Alfil(TiposColor color){
        super(color);
    }

    @Override
    protected int getRank() {
        return 3;
    }

    @Override
    public boolean validarMovimiento(int filaOrigen, int columnaOrigen, int filaDestino, int columnaDestino) {
        return Math.abs(filaOrigen - filaDestino) == Math.abs(columnaOrigen - columnaDestino);
    }

    @Override
    public String obtenerRepresentacion() {
        return "A";
    }

}
