public class ListaEnlazada {
    private Nodo head;
    private int size;

    public Nodo getHead() {
        return head;
    }

    public ListaEnlazada() {
        this.head = null;
        this.size = 0;
    }
    public void agregarNodo(int dato){
        Nodo nuevo=new Nodo(dato);
        nuevo.next= head;
        head = nuevo;
        size++;
    }
    public int borrarMayor(){
       if(head==null)return -1;
       int mayor=encontrarMayor();
        Nodo puntero= head;
        if(head.dato==mayor){
            head =puntero.next;
            puntero.next=null;
        }else {
            boolean igual=false;
            while (puntero.next!=null&& !igual){
                if (puntero.next.dato==mayor){
                    Nodo ref=puntero.next;
                    puntero.next=ref.next;
                    ref.next=null;
                    igual=true;
                }else {
                    puntero=puntero.next;
                }
            }
        }
        return mayor;
    }
    public int encontrarMayor(){
        int mayor= head.dato;
        Nodo actual= head;
        while (actual!=null){
            if (actual.dato>mayor){
                mayor= actual.dato;
            }
            actual=actual.next;
        }
        return mayor;
    }
    public int Size(){
        return size;
    }
    public void listar(){
        Nodo actual = head;
        while (actual!=null){
            System.out.print("["+actual.dato+"]->");
            actual=actual.next;
        }
    }




}