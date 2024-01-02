package aprendiendo.ManejoErrores;

import java.util.Scanner;

public class vectores {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Ingrese tamaño arreglo");
        int length;
        length = myObj.nextInt();
        double num[] = new double[length];


        for (int i = 0; i < length; i++) {
            System.out.println("Ingrese numero para la posición "+i+": ");
            int nume = myObj.nextInt();
            num[i]=nume;
            System.out.println("num["+i+"]: "+num[i]);
        }
        System.out.println("\nArray: ");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

    }
}
