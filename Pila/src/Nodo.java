public class Nodo {
    private Object item;
    private Nodo siguiente;

    public Nodo() {
        item = null;
        siguiente = null;
    }

    public Nodo(Object item) {
        this.item = item;
        siguiente = null;
    }

    public Nodo(Object item, Nodo siguiente) {
        this.item = item;
        this.siguiente = siguiente;
    }

    public void cambiarItem(Object item) {
        this.item = item;
    }

    public void cambiarSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Object obtenerItem() {
        return this.item;
    }
    public Nodo obtenerSiguiente() {
        return this.siguiente;
    }
}