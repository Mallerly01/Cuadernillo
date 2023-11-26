public class Main {

    public static void main(String[] args) {
        Lista list= new Lista();
        for (int i = 1; i <= 10; i++) {
            list.agregarElemento((int)Math.floor(Math.random()*18+1));
        }
        list.imprimirLista();
        list.ordenaLista();
    }

}