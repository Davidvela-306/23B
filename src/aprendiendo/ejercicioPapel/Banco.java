package aprendiendo.ejercicioPapel;

public class Banco {
    public int ci;
    public String nombre;
    //constructor
    public Banco(int ci, String nombre){
        this.ci = ci;
        this.nombre = nombre;
    }
    //Métodos
    public static void registrarUsuario(){ //No puse el static en método
        System.out.println("datos personales");
    }
    public static void r_cuenta_bancaria(){ //No puse el static en método
        System.out.println("Cuenta registrada con éxito");
    }
    //Main
    public static void main(String[] args) {
        Banco persona1 = new Banco(1754690905, "David");
        System.out.println(persona1.ci);
        System.out.println(persona1.nombre);
        persona1.registrarUsuario();
        persona1.r_cuenta_bancaria();
    }
}
