
public class UsoPilaListaEnlazada implements Pila{
    private Nodo tope;
    public UsoPilaListaEnlazada (){
        tope = null;
    }
    public int longitud() {
        int numItems = 0;
        Nodo corriente = tope;
        while (corriente != null){
            numItems++;
            corriente = corriente.obtenerSiguiente();
        }
        return numItems;
    }


    public Object tope() throws ExceptionPila {
        if (tope != null) {
            return tope.obtenerItem();
        }
        else {
            throw new ExceptionPila("Pila vacia, no hay tope");
        }
    }

    public void apilar(Object item) throws ExceptionPila {
        Nodo nuevoNodo = new Nodo(item);
        nuevoNodo.cambiarSiguiente(tope);
        tope = nuevoNodo;
    }

    public boolean esVacia() {
        return (tope == null);
    }


    public void desapilar() throws ExceptionPila {
        if (tope != null){
            tope = tope.obtenerSiguiente();
        }
        else {
            throw new ExceptionPila("No se puede desapilar, la pila esta vacia.");
        }
    }
    public void vaciar() {
        tope = null;
    }
}