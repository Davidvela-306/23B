package aprendiendo.ejercicioPapel;

public class Juego_1 {
    private   int vidas;
    private String nombre;
    private String apellido;
    private   int num_jugadores;

    //constructor
    private Juego_1(int vidas, String nombre, String apellido, int num_jugadores){
        this.vidas = vidas;
        this.nombre = nombre;
        this.apellido = apellido;
        this.num_jugadores = num_jugadores;
    }

    //gets

    public int getVidas() {
        return vidas;
    }

    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }

    public int getNum_jugadores() {
        return num_jugadores;
    }

    //sets
    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNum_jugadores(int num_jugadores) {
        this.num_jugadores = num_jugadores;
    }

    public static void main(String[] args) {
        Juego_1 juego1 = new Juego_1(3, "Fernando", "de la cruz",4);
        System.out.println("Jugador inicialmente se llama "+ juego1.nombre + juego1.apellido);
        juego1.apellido = "Ordoñez";
        System.out.println("Ahora se llama " + juego1.nombre + " " + juego1.apellido );
        
    }
}
