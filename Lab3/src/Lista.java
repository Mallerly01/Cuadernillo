public class Lista {
    public Nodo cabeza;

    public void imprimirLista(){
        Nodo ref=cabeza;
        while (ref!=null){
            System.out.print(ref.dato+" -> ");
            ref=ref.siguiente;
        }
        System.out.println("null");
    }

    public void ordenaLista() {
        if (cabeza == null) {
            System.out.println("Lista vacía");
        } else {
            Nodo nodoActual = cabeza;
            while (nodoActual != null) {
                Nodo nodoSiguiente = nodoActual.siguiente;
                while (nodoSiguiente != null) {
                    if (nodoActual.dato > nodoSiguiente.dato) {
                        int temp = nodoActual.dato;
                        nodoActual.dato = nodoSiguiente.dato;
                        nodoSiguiente.dato = temp;
                    }
                    nodoSiguiente = nodoSiguiente.siguiente;
                }
                nodoActual = nodoActual.siguiente;
            }
        }

        imprimirLista();
    }
    public void agregarElemento(int dato) {
        if(cabeza==null){
            Nodo nuevo = new Nodo(dato,null);
            cabeza=nuevo;
        }else {
            Nodo nuevo=new Nodo(dato,cabeza);
            cabeza=nuevo;
        }

    }
}
