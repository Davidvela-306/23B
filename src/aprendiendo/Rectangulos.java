package aprendiendo;
import java.util.Scanner;

public class Rectangulos
{
    /*
    Crear una clase Rectangulo con atributos de alto y ancho. Proporcionar
    métodos para calcular y devolver el área y el perímetro. Crear un
    programa que instancie dos rectángulos, calcule y muestre su área y perímetro.
     */
    //CLASES:
    public  static class Rectangulo
    {
        //atributos:
        public  double  alto;
        public  double  ancho;

        //método constructor:
        public Rectangulo(double alto, double ancho){
            this.alto = alto;
            this.ancho = ancho;
        }

        //métodos:
        public  double area(){
            return alto * ancho;
        }
        public  double perimetro(){
            return (alto*2)+(ancho*2);
        }

    }
    //EJECUCIÓN DEL PROGRAMA
    public  static void main(String[] args) {
        //declaración variables
        double alto = 0;
        double ancho = 0;
        //Creación objetos
        Scanner scanner = new Scanner(System.in);
        Rectangulo rect_1 = new Rectangulo(alto,ancho);
        Rectangulo rect_2 = new Rectangulo(alto,ancho);

        System.out.println("---  INICIO DEL PROGRAMA ---");
        //Obj 1
        System.out.println("Ingrese el alto del rectángulo 1: ");
        rect_1.alto = scanner.nextDouble();
        System.out.println("Ingrese el ancho del rectángulo 1: ");
        rect_1.ancho = scanner.nextDouble();
        System.out.println("\tRectangulo 1 ");
        System.out.println("Area: " + rect_1.area());
        System.out.println("Perímetro: " + rect_1.perimetro());
        //Obj 2
        System.out.println("Ingrese el alto del rectángulo 2: ");
        rect_2.alto = scanner.nextDouble();
        System.out.println("Ingrese el ancho del rectángulo 2: ");
        rect_2.ancho = scanner.nextDouble();
        System.out.println("\tRectangulo 2 ");
        System.out.println("Area: " + rect_2.area());
        System.out.println("Perímetro: " + rect_2.perimetro());
    }
}
