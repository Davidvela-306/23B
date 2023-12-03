package Clase;

public class Persona {
    public int cedula;
    public String nombre;
    public int edad;

    public Persona(int cedula, String nombre, int edad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
    }

    public void saludar() {
        System.out.println("Hola " + this.nombre);
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona(1754690905, "David", 20);
        Persona persona2 = new Persona(1754654205, "Maik", 25);
        Persona estudiante_esfot = new Persona(1001542876, "Cami", 18);
        System.out.println("El nombre de persona 1 es: " + persona1.nombre);
        System.out.println("El nombre de persona 2 es: " + persona2.nombre);
        System.out.println("\tEstudiante ESFOT \nnombre:" + estudiante_esfot.nombre);
        System.out.println("cedula:" + estudiante_esfot.cedula);
        System.out.println("edad:" + estudiante_esfot.edad);
        System.out.println("---  Saludo personas ---");
        persona1.saludar();
        persona2.saludar();
        estudiante_esfot.saludar();
    }
}
