package elementos.fichas;

import elementos.Ficha;
import elementos.interfaz.TiposColor;

public class Torre extends Ficha {

    public Torre(TiposColor color){
        super(color);
    }

    @Override
    protected int getRank() {
        return 5;
    }

    @Override
    public boolean validarMovimiento(int filaOrigen, int columnaOrigen, int filaDestino, int columnaDestino) {
        return filaOrigen == filaDestino ^ columnaOrigen == columnaDestino;
    }

    @Override
    public String obtenerRepresentacion() {
        return "T";
    }

}
