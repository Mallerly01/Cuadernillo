public class Main {
    public static void main(String[] args) {
        Abb a = new Abb();
        a.Insertar(10);
        a.Insertar(-8);
        a.Insertar(12);
        a.Insertar(4);
        a.Insertar(-7);
        a.Imprimir();
        System.out.println(a.Complemento(8));
        a.Eliminar(-8);
        a.Imprimir();
        System.out.println(a.Complemento(8));
    }
}