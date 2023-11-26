import java.util.ArrayList;
import java.util.List;

public class Main {
    public static ListaEnlazada lista=new ListaEnlazada();
    public static void main(String[] args) {
        for(int i =0; i<10;i++){
            int num= (int)(Math.random()*85);
            lista.agregarNodo(num);
        }
        System.out.println("Lista Original: ");
        lista.listar();
        System.out.println("\n");
        insert();
        System.out.println("Lista Ordenada de menor a mayor: ");
        lista.listar();
    }
    private static void insert(){
        List<Integer> list= new ArrayList<>();
        int n;
        for (int i=0;i< lista.Size();i++){
            n= lista.borrarMayor();
            list.add(n);
        }
        for (Integer num : list){
            lista.agregarNodo(num);
        }
    }
}
