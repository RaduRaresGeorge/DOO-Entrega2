package elementos.fichas;

import elementos.Ficha;
import elementos.interfaz.TiposColor;

public class Caballo extends Ficha {

    public Caballo(TiposColor color){
        super(color);
    }

    @Override
    protected int getRank() {
        return 4;
    }

    @Override
    public boolean validarMovimiento(int filaOrigen, int columnaOrigen, int filaDestino, int columnaDestino) {
        return (Math.abs(filaOrigen - filaDestino) == 2 && Math.abs(columnaOrigen - columnaDestino) == 1) ||
                (Math.abs(filaOrigen - filaDestino) == 1 && Math.abs(columnaOrigen - columnaDestino) == 2);
    }

    @Override
    public String obtenerRepresentacion() {
        return "C";
    }

}
