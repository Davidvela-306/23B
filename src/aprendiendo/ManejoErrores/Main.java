package aprendiendo.ManejoErrores;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Ingrese numero 1: ");
        int resultado;
        int numero1;
        try {
            // input numérico
            numero1 = myObj.nextInt();
            resultado = numero1 * 5;
            System.out.println("Resultado: "+resultado);
        }
        catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        System.out.println("Continuación de la ejecución");


    }
}
