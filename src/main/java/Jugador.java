import elementos.Ficha;
import elementos.fichas.*;
import elementos.interfaz.*;

import java.util.List;

public class Jugador implements Color {

    private ListaOrdenada<Ficha> fichasEnPosesion;
    private ListaOrdenada<Ficha> fichasComidas;
    private TiposColor color;

    public Jugador(TiposColor color){
        fichasEnPosesion = new ListaOrdenada<>();
        fichasComidas = new ListaOrdenada<>();
        this.color = color;
        for (int j = 0; j < 8; j++) {
            fichasEnPosesion.agregar(new Peon(this.color));
        }
        for (int j = 0; j < 2; j++) {
            fichasEnPosesion.agregar(new Torre(this.color));
        }
        for (int j = 0; j < 2; j++) {
            fichasEnPosesion.agregar(new Caballo(this.color));
        }
        for (int j = 0; j < 2; j++) {
            fichasEnPosesion.agregar(new Alfil(this.color));
        }
        fichasEnPosesion.agregar(new Reina(this.color));
        fichasEnPosesion.agregar(new Rey(this.color));
    }

    public TiposColor getColor(){
        return this.color;
    }

    public void setColor(TiposColor color){
        this.color = color;
    }

    public void comerFicha(Ficha ficha){
        fichasEnPosesion.getElementos().remove(ficha);
        fichasComidas.agregar(ficha);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Fichas comidas por el jugador ").append(this.color).append(": ");
        for (Ficha ficha : fichasComidas.getElementos()) {
            sb.append(ficha).append(", ");
        }
        return sb.toString();
    }
}