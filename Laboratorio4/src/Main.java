public class Main {
    public static void main(String[] args) {
        Lista list1= new Lista();
        Lista list2 = new Lista();
        for (int i = 1; i <= 10; i++) {
            list1.agregarElemento((int)Math.floor(Math.random()*18+1));
            list2.agregarElemento((int)Math.floor(Math.random()*18+1));
        }
        System.out.println("***** Listas Originales *****");
        System.out.println("Lista 1: ");
        list1.imprimirLista();
        System.out.println("Lista 2: ");
        list2.imprimirLista();
        int n1=list1.promedio();
        System.out.println("Promedio lista 1: "+n1);
        int n2=list2.promedio();
        System.out.println("Promedio lista 2: "+n2);
        Lista l3= mesclarPorPromedio(list1,list2,n1,n2);
        System.out.println("Lista 3 -> con numeros mayores a los promedios");
        l3.imprimirLista();
        System.out.println("Lista 3 ordenada de menor a mayor");
        l3.ordenaLista();
    }
    public static Lista mesclarPorPromedio( Lista list1, Lista list2, int n1, int n2){
        Nodo ref1=list1.cabeza;
        Nodo ref2=list2.cabeza;
        Lista list3= new Lista();
        while (ref1!=null){
            if (ref1.dato>n1){
                list3.agregarElemento(ref1.dato);

            }
            ref1=ref1.siguiente;
        }
        while (ref2!=null){
            if (ref2.dato>n2){
                list3.agregarElemento(ref2.dato);
            }
            ref2=ref2.siguiente;

        }
        return list3;
    }


}