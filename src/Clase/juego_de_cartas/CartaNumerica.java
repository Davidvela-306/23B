package Clase.juego_de_cartas;

public class CartaNumerica extends Carta
{
    private int numero;
    public CartaNumerica(String nombre, int numero) {
        super(nombre);
        this.numero = numero;
    }
    //Método
    public void mostrarDescripcion(){
        System.out.println("Nombre de tu carta:" + getNombre());
        System.out.println("Numero de carta:" + numero);
    }
    //setters de CartaNumerica
    public void setNumero(int numero) {
        this.numero = numero;
    }
    //getters de CartaNumerica
    public int getNumero() {
        return numero;
    }
}
