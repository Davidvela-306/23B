package tareas.sobreEscrituraSobreCarga;

import java.lang.reflect.Constructor;

public class Empleado {
    //atributos Empleado
    public String nombre;
    public  double salarioBase ;
    //Constructor Empleado
    Empleado(String nombre, double salarioBase){
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

//metodo Empleado
    public void calcularSalario(){
        System.out.println("Cálculo de salario base empleado: " + salarioBase);
    }
}
class Gerrente extends Empleado{
    //nuevos atributos para Gerente
    double bono ;
    //Consutructor
    Gerrente(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        this.bono = bono;
    }

    public void  calcularSalario(){
        System.out.println("Cálculo de salario base Gernete: " + (salarioBase + bono) );
    }
}
class Desarrollador extends Empleado{
    //atributos desarrollador
    double horasExtras;
    //Constructor desarrollador
    Desarrollador(String nombre, double salarioBase, double horasExtras) {
        super(nombre, salarioBase);
        this.horasExtras = horasExtras;
    }
    //método
    public void calcularSalario(){
        System.out.println("Cálculo de salario base Desarrollador: " + (salarioBase +horasExtras) );
    }
}
