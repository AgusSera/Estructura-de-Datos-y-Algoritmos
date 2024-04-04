/*Interface Pila polimorfico*/
public interface Pila {
    /* esVacia(): indica si la pila es vacia o no
     * pre: true
     * post: Retorna true sii la pila no tiene elementos*/
    boolean esVacia();
    /* vaciar(): Elimina todos los elementos de la pila
     * pre: true
     * post: elimina todos los elementos de la pila*/
    void vaciar();
    /* longitud(): Retorna la cantidad de elementos de la pila
     * pre: true
     * post: retorna la cantidad de elementos de la pila*/
    int longitud();
    /* apilar(item): apila item al tope de la pila
     * pre: true
     * post: apila item al tope de la pila
     * Si el apilado falla por algun motivo, lanza una excepcion
     * ExceptionPila*/
    void apilar(Object item) throws ExceptionPila;
    /* desapilar(): elimina el elemento que se encuentra en el
     * tope de la pila
     * pre: longitud()>=1
     * post: si la pila no es vacia, se elimina el elemento en el
     * top de la misma.
     * Si la pila esta vacia, lanza una excepcion ExceptionPila*/
    void desapilar() throws ExceptionPila;
    /* tope(): retorna el elemento en el tope de una pila no vacia
     * pre: longitud()>=1
     * post si la pila no es vacia, retorna el item en el tope de
     * la misma
     * Si la pila esta vacia, lanza una excepcion ExceptionPila*/
    Object tope() throws ExceptionPila;
}