public class Nodo {
    int dato;
    Nodo siguiente=null;
    public Nodo(int dato){
        this.dato=dato;
    }

    public Nodo(int dato, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }
    public Nodo(){}
}
