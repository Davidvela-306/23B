package Clase.juego_de_cartas;
import java.util.Scanner;
public class Main {
    //2 jugadores cada uno tiene una carta
    //ambos lanzan sus cartas y las comparamos
    //la carta con un numero inferior pierde

    public static void main(String[] args) {
        // 2 jugadores
        //jugadores y num de cartas
        CartaNumerica CartaDeJugador_1 = new CartaNumerica("Carta normal", 10);
        CartaEspecial CartaDeJugador_2 = new CartaEspecial("Carta especial", 6);
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("establezca numero del jugador 1");
            int numero_def1 = scanner.nextInt();;
            System.out.println("establezca numero del jugador 2");
            int numero_def2 = scanner.nextInt();

            CartaDeJugador_1.setNumero(numero_def1);
            CartaDeJugador_2.setNumero(numero_def2);
        }catch (Exception e){
            System.out.println("ERROR, SE ASIGNA VALORES POR DEFOULT");
        }

        //Ejecución del juego
        System.out.println("\t\t---------------- Juego de cartas ------------------\n\n");
        System.out.println("Jugador 1");
        CartaDeJugador_1.jugar();
        System.out.println("----- descripción jugador 1 -----");
        CartaDeJugador_1.mostrarDescripcion();


        System.out.println("\nJugador 2:");
        CartaDeJugador_2.jugar();
        System.out.println("----- descripción jugador 2 -----");
        CartaDeJugador_2.mostrarDescripcion();
        CartaDeJugador_2.activarEfectoEspecial();
        int numInicial = CartaDeJugador_1.getNumero();
        int numReducir = CartaDeJugador_2.activarEfectoEspecial();
        int numFinal = numInicial - numReducir;
        CartaDeJugador_1.setNumero(numFinal);

        System.out.println("\t\t\t---  Resultados ---");
        int num_1 = CartaDeJugador_1.getNumero();
        int num_2 = CartaDeJugador_2.getNumero();
        System.out.println("Carta del jugador 1: " + num_1);

        System.out.println("\nCarta del jugador 2: " + num_2);
        if ( num_1 > num_2 ){
            System.out.println("\n**** Gana jugador 1 ****");
        }else{
            System.out.println("\n**** Gana jugador 2 ****");
        }

        //Conversiones
        int myInt = 9;
        double myDouble = myInt; //de int a double
        System.out.println("----------------------------CONVERISONES");
        System.out.println(myInt);      // Salida 9
        System.out.println(myDouble);   // salida 9.0

    }
}
