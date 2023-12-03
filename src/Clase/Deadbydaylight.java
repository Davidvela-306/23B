package Clase;

public class Deadbydaylight {
    //atributos
    String nombre;
    String habilidad;
    String arma;
    int vida;

    //método constructor
    public Deadbydaylight(String nombre,String habilidad,String arma,int vida){
        this.nombre = nombre;
        this.habilidad = habilidad;
        this.arma = arma;
        this.vida = vida;
    }
    // métodos
    public void caminar(){
        System.out.println("Estoy caminando en Quito");
    }
    public void correr(){
        System.out.println("Estoy corriendo");
    }
    public void agacharce(){
        System.out.println("Me estoy agachando");
    }

    //MAIN
    public static void main(String[] args) {
        //Sobrevivientes
        Deadbydaylight surv1 = new Deadbydaylight("Cheryl","Vínculo", "granada", 100);
        //Enemigos
        Deadbydaylight Enemy1 = new Deadbydaylight("Scream","Sigilio", "granada", 100);
        Deadbydaylight Enemy2 = new Deadbydaylight("Cazadora","Bestia de persa", "Acha", 100);

    }
}
