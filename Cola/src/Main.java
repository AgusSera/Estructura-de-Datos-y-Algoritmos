public class Main extends UsoColaArreglo{
    public static void main(String[] args) throws ExceptionCola {
        UsoColaArreglo cola = new UsoColaArreglo();
        cola.encolar(1);
        cola.encolar(2);
        cola.encolar(3);
        System.out.println(cola.longitud());
        System.out.println(cola.esVacia());
        System.out.println(cola.primero());
        cola.desencolar();
        cola.desencolar();
        cola.desencolar();
        System.out.println(cola.esVacia());
    }
}