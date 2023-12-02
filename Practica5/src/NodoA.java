public class NodoA {
    int valor;
    NodoA left;
    NodoA right;

    public NodoA(int valor) {
        this.valor = valor;
    }

    public NodoA(int valor, NodoA left, NodoA right) {
        this.valor = valor;
        this.left = left;
        this.right = right;
    }

    public NodoA() {}
}
