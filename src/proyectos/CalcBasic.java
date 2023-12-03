package proyectos;
import java.util.Scanner;
public class CalcBasic {
    //Suma
    public static float suma(float num1, float num2){
        return num1 + num2;
    }
    //Resta
    public static float resta(float num1, float num2){
        return num1 - num2;
    }
    //Multiplicación
    public static float multiplicacion(float num1, float num2){
        return num1 * num2;
    }
    //División
    public static float division(float num1, float num2){
        boolean bandera = false;
        if(num2 !=0)
        {
            bandera = true;

        }
        System.out.println("El divisor no puede ser 0, inténtelo nuevamente\n");
        while(bandera == false)
        {
            Scanner obj_div = new Scanner(System.in);
            System.out.println("Ingrese el primer número:   ");
            num1 = obj_div.nextFloat();
            System.out.println("Ingrese el segundo número:   ");
            num2= obj_div.nextFloat();
            if(num2 != 0)
            {
                bandera = true;
            }

        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner objeto = new Scanner(System.in);
        System.out.println("Ingrese el primer número:   ");
        float num_1 = objeto.nextFloat();
        System.out.println("Ingrese el segundo número:   ");
        float num_2= objeto.nextFloat();
        System.out.println("-------------------------");
        System.out.println("El resultado es, SUMA: "+ suma(num_1,num_2));
        System.out.println("El resultado es, RESTA: "+ resta(num_1,num_2));
        System.out.println("El resultado es, MULTIPLICACIÓN: "+ multiplicacion(num_1,num_2));
        System.out.println("El resultado es, DIVISIÓN: "+ division(num_1,num_2));
    }
}
