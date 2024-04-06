public interface Cola {
    /*
    * esVacia(): Indica si la cola es vacia o no
    * pre: true
    * post: Retorna true sii la cola no tiene elementos
    * */
    boolean esVacia();

    /*
    * vaciar(): Elimina todos los elementos de la cola
    * pre: true
    * post: elimina todos los elementos de la cola
    * */
    void vaciar();

    /*
    * longitud(): Retorna la cantidad de elementos de la cola
    * pre: true
    * post: retorna la cantidad de elementos de la cola
    * */
    int longitud();

    /*
    * encolar(item): agrega item en el extremo de la cola
    * pre: true
    * post: agrega item en el extremo de entrada de la cola
    * Si la operacion falla por algun motivo, lanza una excepcion
    * ExceptionCola
    * */
    void encolar(Object item) throws ExceptionCola;

    /*
    * desencolar(): elimina el primer elemento en el extremo de la salida de la cola
    * pre: longitud() >= 1
    * post: si la cola es no vacia, se elimina el primer elemento en el extremo de la salida de la misma
    * Si la cola esta vacia, se lanza una excepcion
    * ExceptionCola
    * */
    void desencolar() throws ExceptionCola;

    /* primero(): retorna el primer elemento en el extremo de la salida de la cola
    * pre: longitud() >= 1
    * post: si la cola es no vacia, se retorna el primer elemento en el extremo de la salida de la misma
    * Si la cola esta vacia, se lanza una excepcion
    * ExceptionCola
    * */
    Object primero() throws ExceptionCola;
}
