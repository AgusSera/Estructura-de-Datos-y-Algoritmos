/*
* Implementacion del TAD cola circular usando arreglos
* Mas info: https://somoshackersdelaprogramacion.es/la-estructura-de-datos-cola-en-java
*           https://www.youtube.com/watch?v=BNSjGD8eJbg
* Las colas circulares permiten la reutilizacion de espacio que se desperdicia
* en una cola no circular
* fin = (fin + 1) % MAX_COLA; nos ayuda a calcular la ubicacion correctamente ya que cuando
* queremos ingresar un elemento cuando estamos al final de la cola, esta funcion
* nos devuelve a la primera posicion, osea 0
* (fin + 1) % MAX_COLA = (MAX_COLA - 1 + 1) % MAX_COLA = MAX_COLA % MAX_COLA = 0
* Lo mismo para comienzo = (comienzo + 1) % MAX_COLA
* */

public class UsoColaCircularArreglo implements Cola{
    private final int MAX_COLA = 5;
    private Object array[];
    private int comienzo, fin;
    private int numElementos;

    public UsoColaCircularArreglo() {
        array = new Object[MAX_COLA];
        comienzo = 0;
        numElementos = 0;
        fin = -1;

    }
    @Override
    public boolean esVacia() {
        return (numElementos == 0);
    }

    @Override
    public void vaciar() {
        comienzo = 0;
        fin = -1;
        numElementos = 0;
    }

    @Override
    public int longitud() {
        return numElementos;
    }

    @Override
    public void encolar(Object item) throws ExceptionCola {
        if (numElementos == MAX_COLA) {
            throw new ExceptionCola("La cola esta llena.");
        } else {
            fin = (fin + 1) % MAX_COLA;
            array[fin] = item;
            numElementos++;
        }
    }

    @Override
    public void desencolar() throws ExceptionCola {
        if (esVacia()) {
            throw new ExceptionCola("La cola esta vacia");
        } else {
            comienzo = (comienzo + 1) % MAX_COLA;
            numElementos--;
        }
    }

    @Override
    public Object primero() throws ExceptionCola {
        if (esVacia()) {
            throw new ExceptionCola("La cola esta vacia");
        } else {
            return array[comienzo];
        }
    }
}
