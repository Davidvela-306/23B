package aprendiendo.EjerciciosHerencia;
//------------------------ Clase Estudiante que hereda de Persona
public class Estudiante extends Persona {
    public int matricula;
    public String carrera;

    // Constructor Estudiante
    public Estudiante(String nombre, int edad, int dni, int matricula, String carrera) {
        super(nombre, edad, dni); // Llamada al constructor de la clase base Persona
        this.matricula = matricula;
        this.carrera = carrera;
    }

    //método mostrarInformación + nuevos datos
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Matrícula: "+ matricula);
        System.out.println("Carrera: "+ carrera);
    }
}