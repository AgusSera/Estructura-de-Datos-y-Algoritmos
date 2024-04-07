/*
* Implentacion del TAD cola usando arreglos
* Se dara uso a cursores que marquen el inicio y el final de la cola
*
* PROBLEMAS DE ESTA IMPLEMENTACION:
* - La capacidad es fija. Una vez que la cola alcanza la capacidad maxima,
* no se puede agregar mas elementos, incluso si hay espacio disponible en
* el arreglo.
* - Al encolar el ultimo elemento, no se puede volver a colocar otro mas
* aunque se desencolen todos los elementos que tiene delante, hay que vaciar primero
*/

public class UsoColaArreglo implements Cola{
    private static final int MAX_COLA = 100;
    private Object array[];
    private int comienzo, fin;

    /*CONSTRUCTOR*/
    public UsoColaArreglo(){
        array = new Object[MAX_COLA];
        comienzo = 0;
        fin = -1;
    }

    @Override
    public boolean esVacia() {
        return (comienzo > fin);
    }

    //BORRADO LOGICO
    @Override
    public void vaciar() {
        comienzo = 0;
        fin = -1;
    }

    @Override
    public int longitud() {
        if (comienzo > fin) {
            return (0);
        } else {
            return (fin - comienzo + 1);
        }
    }

    @Override
    public void encolar(Object item) throws ExceptionCola {
        if (fin == MAX_COLA - 1) {
            throw new ExceptionCola("La cola esta llena");
        } else {
            fin++;
            array[fin] = item;
        }
    }

    @Override
    public void desencolar() throws ExceptionCola {
        if (longitud() >= 1) {
            comienzo++;
        } else {
            throw new ExceptionCola("La cola esta vacia.");
        }
    }

    @Override
    public Object primero() throws ExceptionCola {
        if (longitud() >= 1) {
            return array[comienzo];
        } else {
            throw new ExceptionCola("La cola esta vacia.");
        }
    }
}
