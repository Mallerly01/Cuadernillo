public class Arbol {
    NodoA raiz;
    public int contar (NodoA r){
        if(r==null)return 0;
        int i = 1;
        int left=contar(r.left);
        int right=contar(r.right);
        return (i+left+right);
    }
    public void insertarElemento(int i){
        raiz=insertar(raiz,i);
    }
    private NodoA insertar(NodoA r, int i){
        if(r==null){
            return new NodoA(i,null,null);
        }
        if(i<r.valor){
            r.left=insertar(r.left,i);
        }else{
            r.right=insertar(r.right,i);
        }
        return r;
    }
    public void inOrden(NodoA n){
        if(n==null)return;
        inOrden(n.left);
        System.out.println(n.valor+"  ");
        inOrden(n.right);
    }
}
