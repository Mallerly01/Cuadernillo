public class Lista {
    public Nodo cabeza;

    public int promedio(){
        int suma=0;
        int contador=0;
        Nodo ref1=cabeza;
        while (ref1!=null){
            suma=suma+ ref1.dato;
            contador++;
            ref1=ref1.siguiente;
        }
        int promedio=suma/contador;
        return promedio;
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

    public void imprimirLista(){
        Nodo ref=cabeza;
        while (ref!=null){
            System.out.print(ref.dato+" -> ");
            ref=ref.siguiente;
        }
        System.out.println("null");
    }

    public void agregarElemento(int dato) {
        Nodo nuevo=new Nodo(dato);
        if (cabeza==null){
            nuevo.siguiente=null;
            cabeza=nuevo;
        }else {
            nuevo.siguiente=cabeza;
            cabeza=nuevo;
        }

    }
}
