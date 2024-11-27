import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaOrdenada<T extends Comparable<T>> {
    private List<T> elementos;

    public ListaOrdenada() {
        this.elementos = new ArrayList<>();
    }

    public void agregar(T elemento) {
        elementos.add(elemento);
        Collections.sort(elementos);
    }

    public List<T> getElementos() {
        return elementos;
    }

}