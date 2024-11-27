package elementos.fichas;

import elementos.Ficha;
import elementos.interfaz.TiposColor;

public class Reina extends Ficha {

    public Reina(TiposColor color){
        super(color);
    }

    @Override
    protected int getRank() {
        return 9;
    }

    @Override
    public boolean validarMovimiento(int filaOrigen, int columnaOrigen, int filaDestino, int columnaDestino) {
        return filaOrigen == filaDestino ^ columnaOrigen == columnaDestino || Math.abs(filaOrigen - filaDestino) == Math.abs(columnaOrigen - columnaDestino);
    }

    @Override
    public String obtenerRepresentacion() {
        return "Q";
    }

}
