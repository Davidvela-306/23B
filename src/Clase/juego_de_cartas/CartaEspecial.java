package Clase.juego_de_cartas;
import java.util.Scanner;

public class CartaEspecial extends CartaNumerica {


    public CartaEspecial(String nombre, int numero){
        super(nombre, numero);
    }
    public int activarEfectoEspecial(){
        Scanner scanner = new Scanner(System.in);
        int numeroReducir;

        System.out.println("Carta especial Activada: Reduce el numero del oponente, elige el número que le restará(entre 1 y 5)");
        numeroReducir = scanner.nextInt();
        while (numeroReducir<1 && numeroReducir>5) {
            System.out.println("Vuelve a ingresar un valor entre 1 y 5");
            numeroReducir = scanner.nextInt();
        }
        return numeroReducir;
    }

    @Override
    public void mostrarDescripcion() {
        System.out.println("Nombre de tu carta:" + getNombre());
        System.out.println("Numero de carta:" + getNumero());
        System.out.println("Tu carta es especial");
    }
}
