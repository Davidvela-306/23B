package proyectos;
import java.util.Scanner;

public class NumMayMen {
    public static void main(String[] args) {
        Scanner objeto = new Scanner(System.in);
        System.out.println("Primer número:   ");
        int x = objeto.nextInt();
        System.out.println("segundo número:   ");
        int y = objeto.nextInt();
        System.out.println("Tercer número:   ");
        int z = objeto.nextInt();
        if(x>y)
        {
            if(x>z && z>y)
            {
                System.out.println("El número mayor es " + x);
                System.out.println("El número menor es " + y);
            }
            if(x<z )
            {
                System.out.println("El número mayor es " + z);
                System.out.println("El número menor es " + y);
            }
        }
        if(x<y)
        {
            if(y>z && z>x)
            {
                System.out.println("El número mayor es " + y);
                System.out.println("El número menor es " + x);
            }
            if(y<z )
            {
                System.out.println("El número mayor es " + z);
                System.out.println("El número menor es " + x);
            }
        }
        if(z<y)
        {
            if(z<x && y>x)
            {
                System.out.println("El número mayor es " + y);
                System.out.println("El número menor es " + z);
            }
            if(z<x && y<x)
            {
                System.out.println("El número mayor es " + x);
                System.out.println("El número menor es " + z);
            }
        }

    }
}
