package tareas.sobreEscrituraSobreCarga;

public class Main {
    public static void main(String[] args) {
        Empleado obj_empleado = new Empleado("John", 100.22);
        Gerrente obj_gerente = new Gerrente("Mia", 100.33,  300.1);
        Desarrollador obj_desarrollador = new Desarrollador("Cami", 100.44, 4);

        obj_empleado.calcularSalario();
        obj_gerente.calcularSalario();
        obj_desarrollador.calcularSalario();

    }
}
