package aprendiendo.EjerciciosHerencia;

public class Persona {
    //Atributos
    public String nombre;
    public int edad;
    public int dni;

    //método constructor
    public Persona(String nombre, int edad, int dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    //métodos
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("DNI: " + dni);
    }

}
