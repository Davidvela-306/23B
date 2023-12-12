package aprendiendo;

public class SobrecargaMetodos {
    //Si dentro de los parámetros para el método son distintos, se toma como dos métodos distintos
    //Sale error si en dos métodos tenemos como parámentros del mismo tipo
    public void caminar(int a){

    }
    public void caminar(){

    }
    public void caminar(String nombre){

    }

    public static void main(String[] args) {
        System.out.println("Holaaa");
    }
}
