import elementos.Ficha;
import elementos.fichas.*;
import elementos.interfaz.*;

public class Jugador implements Color {

    private Ficha[] fichasEnPosesion;
    private Ficha[] fichasComidas;
    private TiposColor color;

    public Jugador(TiposColor color){
        fichasEnPosesion = new Ficha[16];
        fichasComidas = new Ficha[16];
        this.color = color;
        int i = 0;
        for (int j = 0; j < 8; j++) {
            fichasEnPosesion[i++] = new Peon(this.color);
        }
        for (int j = 0; j < 2; j++) {
            fichasEnPosesion[i++] = new Torre(this.color);
        }
        for (int j = 0; j < 2; j++) {
            fichasEnPosesion[i++] = new Caballo(this.color);
        }
        for (int j = 0; j < 2; j++) {
            fichasEnPosesion[i++] = new Alfil(this.color);
        }
        fichasEnPosesion[i++] = new Reina(this.color);
        fichasEnPosesion[i] = new Rey(this.color);
    }

    public TiposColor getColor(){
        return this.color;
    }

    public void setColor(TiposColor color){
        this.color = color;
    }

    public void comerFicha(Ficha ficha){
        for (int i = 0; i < fichasEnPosesion.length; i++) {
            if (fichasEnPosesion[i] == ficha){
                fichasEnPosesion[i] = null;
                break;
            }
        }
        for (int i = 0; i < fichasComidas.length; i++) {
            if (fichasComidas[i] == null){
                fichasComidas[i] = ficha;
                break;
            }
        }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Fichas comidas por el jugador ").append(this.color).append(": ");
        for (Ficha ficha : fichasComidas) {
            if (ficha != null){
                sb.append(ficha).append(", ");
            }
        }
        return sb.toString();
    }
}
