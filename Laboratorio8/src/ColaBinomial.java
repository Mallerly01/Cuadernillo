public class ColaBinomial {
    NodoCB head; // Puntero al primer árbol binomial de la cola
    ColaBinomial(){head=null;} // Constructor

    //Inserción de un elemento en la cola binomial
    void Insert(int a) {
        ColaBinomial H1 = new ColaBinomial();
        H1.head = new NodoCB(null, null, null, a, (short)0);
        head = BinomialHeapUnion(H1);
    }

    public void listar(){//lista la cola
        System.out.println("*** Cola Binomial ***");
        if (head!=null){
            imprimir(head,0);
        }
    }
    //-------------------------------------------------------------------------------
    //cuenta la cantidad de nodos haciendo la suma de 2 elevado a la cantidad de hijos
    //que tiene la raiz de cada arbol binomial ingresado en la cola
    public int size() {
        int cant = 0;
        NodoCB ref = head;
        while (ref != null) {
            cant += (int) Math.pow(2, ref.grado);
            ref = ref.hermano;
        }
        return cant;
        /*
        el coste de este algoritmo es de 0(lg n) por que en el peor de los casos se realiza la recursividad
        0(lg n) veces, la razon de esto es porque el size no recorre todos los nodos
        que hay en la cola, en cambio solo recorre el primer nodo de cada arbol
        binomial que esta ingresado en ella.
         */
    }

     private void imprimir(NodoCB ref, int nivel){//nivel sirve para el espaciado
        if(ref!=null){
            StringBuilder cosito = new StringBuilder();
            for (int i = 0; i<nivel;i++){
                cosito.append("   ");
            }
            cosito.append(ref.dato.toString());
            System.out.println(cosito);
            if(ref.hijo!=null){
                imprimir(ref.hijo,(nivel+1));
            }
            if(ref.hermano!=null){
                imprimir(ref.hermano,nivel);
            }
        }
    }

    private NodoCB BinomialHeapUnion(ColaBinomial H2){
        ColaBinomial H = BinomialHeapMerge(this, H2);
        if(H.head==null) return H.head;
        NodoCB prevx= null;
        NodoCB x = H.head;
        NodoCB nextx=x.hermano;
        while(nextx!=null) {
            if ((x.grado != nextx.grado) ||  (nextx.hermano !=null && nextx.hermano.grado == x.grado)){
                prevx = x;
                x = nextx;
            }
            else if(x.dato <= nextx.dato) {
                x.hermano = nextx.hermano;
                nextx.BinomialLink(x);
            }
            else {
                if(prevx==null) H.head=nextx;
                else  prevx.hermano = nextx;
                x.BinomialLink(nextx);
                x = nextx;
            }
            nextx = x.hermano;
        }
        return H.head;
    }

    private  ColaBinomial BinomialHeapMerge(ColaBinomial H1, ColaBinomial H2) {
        NodoCB h1 = H1.head;
        NodoCB h2 = H2.head;
        if (h1==null) return H2;
        if (h2==null) return H1;
        ColaBinomial H = new ColaBinomial();
        NodoCB ini = null;
        NodoCB fin= null;
        while(h1!=null && h2!=null) {
            if(h1.grado <= h2.grado) {
                if(ini == null) {ini = fin= h1;}
                else {fin.hermano = h1; fin = h1;}
                h1 = h1.hermano;
            }
            else  {
                if(ini == null) {ini = fin= h2;}
                else {fin.hermano = h2; fin = h2;}
                h2 = h2.hermano;
            }
        }
        if(h1==null) fin.hermano = h2;
        if(h2==null) fin.hermano = h1;
        H.head=ini;
        return  H;
    }
}
