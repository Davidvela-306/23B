package Clase;

public class Estudiantes {
    public String nombre;
    public int edad;

    public Estudiantes(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void saludar() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
    }

    public static void main(String[] args) {
        Estudiantes estudiante_desarrollo = new Estudiantes("JHON", 22);
        estudiante_desarrollo.saludar();
    }
}
