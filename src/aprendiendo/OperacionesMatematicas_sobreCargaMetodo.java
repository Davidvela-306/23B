package aprendiendo;
//Desarrolla una clase llamada OperacionesMatematicas que tenga los siguientes métodos sobrecargados:
//1.Este método debe aceptar dos números enteros y devolver su suma +.
//2.Sobrecarga el método anterior para aceptar tres números enteros y devolver su suma +5.
//3.Sobrecarga el método para aceptar dos números decimales y devolver su suma +2.
public class OperacionesMatematicas_sobreCargaMetodo
{
    //Atributos
    int num1,num2, num3;
    double num4, num5;
    //Constructor 1
    OperacionesMatematicas_sobreCargaMetodo(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    //Constructor 2
    OperacionesMatematicas_sobreCargaMetodo(int num1, int num2, int num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
    //Constructor 3
    OperacionesMatematicas_sobreCargaMetodo(int num1, int num2, int num3, double num4, double num5){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
        this.num5 = num5;
    }
    //método 1
    public int suma(int num1, int num2){
        return num1 +num2;
    }
    //método 2
    public int suma(int num1, int num2, int num3){
        return num1 + num2 + num3 + 5;
    }
    public double suma(int num1, int num2, int num3, double num4, double num5){
        return num1 + num2 + num3 + num4 + num5 +2;
    }

    //-----------------------------------MAIN
    public static void main(String[] args) {
        OperacionesMatematicas_sobreCargaMetodo obj1 = new OperacionesMatematicas_sobreCargaMetodo(2,3);
        OperacionesMatematicas_sobreCargaMetodo obj2 = new OperacionesMatematicas_sobreCargaMetodo(2,3,5);
        OperacionesMatematicas_sobreCargaMetodo obj3 = new OperacionesMatematicas_sobreCargaMetodo(2,3,5,2.4,3.1);
        System.out.println("SUMA 1: " + obj1.suma(obj1.num1,obj1.num2) );
        System.out.println("SUMA 2 + 5 extra: " + obj2.suma(obj2.num1,obj1.num2, obj2.num3) );
        System.out.println("SUMA 3 + 2 extra : " + obj3.suma(obj3.num1,obj3.num2, obj3.num3, obj3.num4, obj3.num5) );
    }
}
