public class Main {
    public static void main(String[] args) {
        Arbol nuevo = new Arbol();
        nuevo.insertarElemento(8);
        nuevo.insertarElemento(20);
        nuevo.insertarElemento(5);
        nuevo.insertarElemento(2);
        nuevo.insertarElemento(7);
        nuevo.insertarElemento(15);
        nuevo.insertarElemento(19);
        int i = nuevo.contar(nuevo.raiz);
        System.out.println("cantidad: "+i);
        nuevo.inOrden(nuevo.raiz);
    }
}