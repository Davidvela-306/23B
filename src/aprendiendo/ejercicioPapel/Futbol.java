package aprendiendo.ejercicioPapel;

public class Futbol {
    //Atributos
    public double recorrido;
    public int num_equipos;
    //constructor
    public  Futbol(double recorrido, int num_equipos){
        this.recorrido = recorrido;
        this.num_equipos = num_equipos;
    }
    //Métodos
    public static void correr(){ // Faltó el static
        System.out.println("Recorrido 200 metros");
    }

    public static void main(String[] args) {
        correr(); //solo llamo al método de la clase aislado
    }
}

