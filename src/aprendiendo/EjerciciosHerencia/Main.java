package aprendiendo.EjerciciosHerencia;

public class Main {
    public static void main(String[] args) {
        //crear instancias de Estudiante, Profesor y Administrativo
        System.out.println("INFORMACIÓN ESTUDIANTES");
        Estudiante Estudiante1 = new Estudiante( "David", 20, 1754690905, 123, "Software");
        Estudiante1.mostrarInformacion();
        System.out.println("INFORMACIÓN PROFESOR");
        Profesor Profesor1 = new Profesor( "Yadira", 42, 1754693343, 321, "POO");
        Profesor1.mostrarInformacion();
        System.out.println("INFORMACIÓN ADMIN");
        Administrativo Admin1 = new Administrativo( "Mónica", 23, 1754690343, 589, "Admisión");
        Admin1.mostrarInformacion();
    }
}
