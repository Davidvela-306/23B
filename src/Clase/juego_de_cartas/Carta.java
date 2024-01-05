package Clase.juego_de_cartas;

import java.util.Scanner;

public abstract class Carta
{
    private String nombre;

    public Carta(String nombre){
        this.nombre = nombre;
    }
    public int jugar(){
        //Objeto scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("presiona 0 para lanzar tu carta:");
        int lanzarCarta = scanner.nextInt();  // leer input jugador 1
        return lanzarCarta;
    }


    //setters de Carta
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //getters de Carta
    public String getNombre() {
        return nombre;
    }
}
