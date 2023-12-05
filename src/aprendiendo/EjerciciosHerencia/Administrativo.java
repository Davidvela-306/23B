package aprendiendo.EjerciciosHerencia;
//------------------------Clase Administrativo que hereda de persona
public class Administrativo extends Persona {
    public int codigoEmpleadoAdmin;
    public String departamento;

    // Constructor Administrativo
    public Administrativo(String nombre, int edad, int dni, int codigoEmpleadoAdmin, String departamento) {
        super(nombre, edad, dni); // Llamada al constructor de la clase base Persona
        this.codigoEmpleadoAdmin = codigoEmpleadoAdmin;
        this.departamento = departamento;
    }

    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Código empleado admin: "+ codigoEmpleadoAdmin);
        System.out.println("Departamento: "+ departamento);
    }

}
