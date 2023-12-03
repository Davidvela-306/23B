package aprendiendo;
import  java.util.Scanner;

public class BasesPOO
{
    /**
     * ENUNCIADO: Crear una clase con atrubutos, métodos y mostrarlos en consola.
     * INTEGRANTES: Scarlett Luna, Mónica Jaña, Kevin Almeida y David Vela.
     */
    //clases
    public static class Movil{
        //Atributos:
        public static String marca;
        public static String modelo;
        public static String color;

        //Métodos:
        public static void llamar(){
            System.out.println("Estoy llamando!!!");
        }
        public static void ingresarContactos(){
            System.out.println("---  INGRESAR CONTACTO ---");
            Scanner entrada = new Scanner(System.in);
            int numero;
            String nombre;
            System.out.println("Ingrese el nombre: ");
            nombre = entrada.nextLine();
            System.out.println("Ingrese el número: ");
            numero = entrada.nextInt();

            System.out.println("El contacto " + nombre + ":" + numero + " fué registrado ");
        }
    }

//Ejecución del programa
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //creamos objeto
        Movil cel_1 = new Movil();    // reservamos espacio para una variable
        // llamada cel_1 de tipo Movil, le asignamos que sea un objeto de la
        // clase Movil(), con los paréntesis accedemos al método constructor

        //Quemar datos:
        cel_1.marca = "Redmi ";
        cel_1.modelo = "A11";
        cel_1.color = "Turqueza claro";

        System.out.println("--- INFORMACIÓN DEL MÓVIL ---");
        System.out.println("Marca: "+cel_1.marca);
        System.out.println("Modelo: "+cel_1.modelo);
        System.out.println("Color: "+cel_1.color);

        //llamada método
        cel_1.ingresarContactos();
        System.out.println("Desea llamar?\ntrue o false");
        boolean llamada;
        llamada = entrada.nextBoolean();
        if (llamada == true){
            cel_1.llamar();
        }else{
            System.out.println("ADIOS");
            System.out.println("Gracias por usar nuestro sistema :)");
        }
    }
}
