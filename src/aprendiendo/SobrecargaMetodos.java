package aprendiendo;

public class SobrecargaMetodos {
    //Si dentro de los parámetros para el método son distintos, se toma como dos métodos distintos
    //Sale error si en dos métodos tenemos como parámentros del mismo tipo
    public void caminar(int a){

    }
    public void caminar(){

    }
    //Los siguientes métodos son idénticos, esto provoca un error
    public void caminar(String nombre){

    }
}

