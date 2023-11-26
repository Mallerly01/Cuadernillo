public class Nodo {
    public int dato;
    public Nodo next;

    public Nodo(int dato) {
        this.dato = dato;
        this.next = null;
    }
    public Nodo(int d, Nodo n){
        dato=d;
        next=n;
    }
    public Nodo(){}

    public void Enlace(Nodo g) {
        next = g;
    }
}
