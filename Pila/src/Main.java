public class Main extends UsoPilaArreglo{
    public static void main(String[] args) throws ExceptionPila {
        /* UsoPilaArreglo pila = new UsoPilaArreglo();
        System.out.println(pila.esVacia());
        pila.apilar(5);
        pila.apilar(4);
        System.out.println(pila.longitud());
        System.out.println(pila.esVacia());
        System.out.println(pila.tope());
        pila.desapilar();
        System.out.println(pila.tope());
        pila.vaciar();
        System.out.println(pila.esVacia());
        pila.desapilar(); */
        UsoPilaListaEnlazada pila2 = new UsoPilaListaEnlazada();
        pila2.apilar(2);
        pila2.apilar(3);
        System.out.println(pila2.esVacia());
        System.out.println(pila2.tope());
        pila2.desapilar();
        pila2.desapilar();
        System.out.println(pila2.esVacia());
        System.out.println(pila2.longitud());
    }
}