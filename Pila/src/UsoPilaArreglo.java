/*Implementacion del TAD pila usando arreglo de enteros con
 * tamaño maximo MAX_PILA*/
public class UsoPilaArreglo implements Pila{
    private static final int MAX_PILA = 100;
    private Object items[];
    private int tope;
    /* UsoPilaArreglo(): Constructor
     * pre: true
     * post: Se crea arreglo de objetos de tamanio maximo MAX_PILA
     * y se inicializa con tope -1*/
    public UsoPilaArreglo(){
        items = new Object[MAX_PILA];
        tope = -1;
    }
    public boolean esVacia() {
        return (tope == -1);
    }
    public int longitud() {
        return tope + 1;
    }
    public Object tope() throws ExceptionPila {
        if (tope != -1){
            return items[tope];
        }
        else {
            throw new ExceptionPila("La pila esta vacia.");
        }
    }
    public void apilar(Object item) throws ExceptionPila {
        if (tope == MAX_PILA-1){
            throw new ExceptionPila("La pila esta llena.");
        }
        else {
            tope++;
            items[tope] = item;
        }
    }
    public void desapilar() throws ExceptionPila {
        if (tope == -1){
            throw new ExceptionPila("La pila esta vacia.");
        }
        else {
            tope--; // DESAPILADO LOGICO
        }
    }
    public void vaciar() {
        tope = -1; // BORRADO LOGICO
    }
}