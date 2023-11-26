public class Abb {
    private NodoAbb laRaiz = null;

    public Abb() {
    }

    public boolean Complemento(int elemento) {
        int i = elemento * -1;
        NodoAbb nodo = this.buscaNodo(this.laRaiz, i);
        return nodo != null;
    }

    private NodoAbb buscaNodo(NodoAbb nodo, int elemento) {
        if (nodo == null) {
            return null;
        } else if (nodo.elemento == elemento) {
            return nodo;
        } else {
            NodoAbb left = this.buscaNodo(nodo.left, elemento);
            NodoAbb right = this.buscaNodo(nodo.right, elemento);
            return left != null ? left : right;
        }
    }

    public void Insertar(int elemento) {
        this.laRaiz = this.InsertaenAbb(this.laRaiz, elemento);
    }

    private NodoAbb InsertaenAbb(NodoAbb nodo, int elemento) {
        if (nodo == null) {
            return new NodoAbb(this, elemento, (NodoAbb)null, (NodoAbb)null);
        } else {
            if (elemento < nodo.elemento) {
                nodo.left = this.InsertaenAbb(nodo.left, elemento);
            } else {
                nodo.right = this.InsertaenAbb(nodo.right, elemento);
            }

            return nodo;
        }
    }

    public void Eliminar(int elemento) {
        this.laRaiz = this.EliminaenAbb(this.laRaiz, elemento);
    }

    private NodoAbb EliminaenAbb(NodoAbb nodo, int elemento) {
        if (nodo.elemento == elemento) {
            if (nodo.left == null && nodo.right == null) {
                return null;
            }

            if (nodo.left == null) {
                return nodo.right;
            }

            if (nodo.right == null) {
                return nodo.left;
            }

            nodo.elemento = this.MayorElemento(nodo.left);
            nodo.left = this.EliminaenAbb(nodo.left, nodo.elemento);
        } else if (nodo.elemento > elemento) {
            nodo.left = this.EliminaenAbb(nodo.left, elemento);
        } else {
            nodo.right = this.EliminaenAbb(nodo.right, elemento);
        }

        return nodo;
    }

    private int MayorElemento(NodoAbb nodo) {
        return nodo.right == null ? nodo.elemento : this.MayorElemento(nodo.right);
    }

    public void Imprimir() {
        this.ImprimeAbb(this.laRaiz, " ");
    }

    private void ImprimeAbb(NodoAbb n, String tab) {
        if (n != null) {
            System.out.println(tab + n.elemento);
            this.ImprimeAbb(n.left, tab + "  ");
            this.ImprimeAbb(n.right, tab + "  ");
        }

    }

    class NodoAbb {
        int elemento;
        NodoAbb left;
        NodoAbb right;

        NodoAbb(Abb this$0, int elemento, NodoAbb left, NodoAbb right) {
            this.elemento = elemento;
            this.left = left;
            this.right = right;
        }

        void Print() {
            System.out.println(this.elemento);
        }
    }
}
