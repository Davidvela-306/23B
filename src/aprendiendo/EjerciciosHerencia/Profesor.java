package aprendiendo.EjerciciosHerencia;

//------------------------Clase profesor que hereda de persona
public class Profesor extends Persona {
    public int codigoEmpleado;
    public String materiaAsignada;

    // Constructor Profesor
    public Profesor(String nombre, int edad, int dni, int codigoEmpleado, String materiaAsignada) {
        super(nombre, edad, dni); // Llamada al constructor de la clase base Persona
        this.codigoEmpleado = codigoEmpleado;
        this.materiaAsignada = materiaAsignada;
    }

    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Código de empleado: "+ codigoEmpleado);
        System.out.println("materia: "+ materiaAsignada);
    }
}
