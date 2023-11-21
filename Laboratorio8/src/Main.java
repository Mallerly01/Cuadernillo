import java.util.InputMismatchException;
import java.util.Scanner;
//Mallerly Carrasco Guerra
//Valentina Eriza Sepúlveda
public class Main {
    public static void main(String[] args) {
        ColaBinomial colita = new ColaBinomial();
        Scanner tec= new Scanner(System.in);
        int num;
        try {
            do {
                System.out.println("----------");
                System.out.println("Ingrese un numero, -1 para salir");
                num= tec.nextInt();
                if(num!=-1){
                    colita.Insert(num);
                    colita.listar();
                    int i=colita.size();
                    System.out.println("La cantidad de nodos es: "+i);
                }else{
                    System.out.println("Saliendo...");
                }
            }while (num!=-1);
        }catch (InputMismatchException e){
            System.out.println("Ingrese solo numeros");
        }

    }
}